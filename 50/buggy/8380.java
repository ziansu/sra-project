private void updateListHeight(android.widget.ListView listView, com.medic.medicapp.WarningAdapter adapter) {
    adapter.notifyDataSetChanged();
    com.medic.medicapp.UIUtils.setListViewHeightBasedOnItems(listView);
}