public void modifyMode(boolean state) {
    adapter = new uz.samtuit.samapp.adapters.MyItineraryAdapter(getContext(), day, state, true, getFragmentManager());
    mRecyclerView.setAdapter(adapter);
}