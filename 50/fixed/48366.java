@java.lang.Override
public void update(java.util.Observable observable, java.lang.Object o) {
    android.util.Log.d("favoritesfrag update", "entered");
    detailsAdapter.notifyDataSetChanged();
    listView.setAdapter(detailsAdapter);
    detailsAdapter.notifyDataSetChanged();
}