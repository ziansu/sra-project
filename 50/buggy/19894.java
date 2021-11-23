@java.lang.Override
public void onRefresh() {
    lots.add(testLot4);
    adapter.notifyDataSetChanged();
    accessNewLotMenu(list);
    mainSwipe.setRefreshing(false);
}