@java.lang.Override
public void onRefresh() {
    mainSwipe.setRefreshing(false);
    lots.add(testLot4);
    adapter.notifyDataSetChanged();
    accessNewLotMenu(list);
}