@java.lang.Override
public void onItemClicked(int pos) {
    java.util.Date selectedDate = dateList.get(pos).first;
    if ((selectedDate.compareTo(mResultsAdapter.mDate)) == 0) {
        return ;
    }
    mResultsAdapter = new com.codeground.wanderlustbulgaria.Fragments.PlannerFragment.PlanAdapter(getActivity(), selectedDate);
    mResultsAdapter.setTextKey("title");
    mResultsAdapter.setImageKey("photo");
    mResultsAdapter.addOnQueryLoadListener(this);
    mResults.setAdapter(mResultsAdapter);
    mLayoutManager.smoothScrollToPosition(mCalendarView, null, pos);
}