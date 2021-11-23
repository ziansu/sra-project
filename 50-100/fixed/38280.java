private void checkAdapter() {
    if ((recyclerView) != null) {
        recyclerView.setAdapter(nearbyAdapter);
        locationKeyMap.remove(mAuth.getCurrentUser().getUid());
        nearbyAdapter.notifyDataSetChanged();
    }else {
        recyclerView = ((android.support.v7.widget.RecyclerView) (findViewById(R.id.nearby_RecyclerView)));
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(nearbyAdapter);
        nearbyAdapter.notifyDataSetChanged();
    }
}