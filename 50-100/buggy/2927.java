@java.lang.Override
public void onRefresh() {
    mArrFood.clear();
    swipeRefreshLayout.setRefreshing(true);
    java.util.List<com.aaa.cybersrishti.model.FoodItem> fooditems = db.getTodayFoodItems();
    for (com.aaa.cybersrishti.model.FoodItem fitem : fooditems) {
        mArrFood.add(fitem);
    }
    java.util.Collections.reverse(mArrFood);
    fa.notifyDataSetChanged();
    swipeRefreshLayout.setRefreshing(false);
}