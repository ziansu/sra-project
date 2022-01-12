private void updateUI() {
    tvao.mmad.itu.tingle.Model.ThingRepository repository = tvao.mmad.itu.tingle.Model.ThingRepository.get(getActivity());
    java.util.List<tvao.mmad.itu.tingle.Model.Thing> things = repository.getThings();
    if ((mAdapter) == null) {
        mAdapter = new tvao.mmad.itu.tingle.Controller.Helpers.ThingAdapter(things, getContext());
        mThingRecyclerView.setAdapter(mAdapter);
    }else {
        mAdapter.setThings(things);
        mAdapter.notifyDataSetChanged();
    }
}