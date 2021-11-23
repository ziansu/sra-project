private void updateList() {
    tvao.mmad.itu.tingle.Model.ThingRepository thingRepository = tvao.mmad.itu.tingle.Model.ThingRepository.get(getActivity());
    java.util.List<tvao.mmad.itu.tingle.Model.Thing> things = thingRepository.getThings();
    mSearchHandler.sortDefault(things);
    if ((mAdapter) == null) {
        mAdapter = new tvao.mmad.itu.tingle.Controller.Fragments.ThingListFragment.ThingAdapter(things);
        mThingRecyclerView.setAdapter(mAdapter);
    }else {
        mAdapter.setThings(things);
        mAdapter.notifyDataSetChanged();
    }
    updateSubtitle();
}