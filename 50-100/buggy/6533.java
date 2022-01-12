@java.lang.Override
public void onResume() {
    super.onResume();
    try {
        setUpMapIfNeeded();
    } catch (com.parse.ParseException e) {
        e.printStackTrace();
    } catch (org.json.JSONException e) {
        e.printStackTrace();
    }
    synchronized(mListView) {
        mListView.deferNotifyDataSetChanged();
    }
    createEventList();
    mSlidingUpPanelLayout.hidePane();
    mListView.setAdapter(new android.widget.ArrayAdapter(getActivity(), R.layout.simple_list_item, listOfSharedWord));
}