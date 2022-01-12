@java.lang.Override
public void onStart() {
    super.onStart();
    if (foodList.isEmpty()) {
        getFoodsData();
    }
    if (gq.fokia.eatwhat.RecentFood.recentFoods.isEmpty()) {
        copyList();
    }
    cursor.close();
    foodList.clear();
    cursor = gq.fokia.eatwhat.MainActivity.db.query("food", null, "recent LIKE '%'", null, null, null, "recent DESC");
    helper.attachToRecyclerView(null);
    helper = new android.support.v7.widget.helper.ItemTouchHelper(new gq.fokia.eatwhat.RecentCallBack());
    helper.attachToRecyclerView(recyclerView);
}