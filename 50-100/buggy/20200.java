@java.lang.Override
public void onStart() {
    super.onStart();
    if (foodList.isEmpty()) {
        getFoodsData();
    }
    if (gq.fokia.eatwhat.LoveFoodFragment.current_foods.isEmpty()) {
        copyList();
    }
    cursor.close();
    foodList.clear();
    cursor = gq.fokia.eatwhat.MainActivity.db.query("food", null, "like = 1", null, null, null, null);
    helper.attachToRecyclerView(null);
    helper = new android.support.v7.widget.helper.ItemTouchHelper(new gq.fokia.eatwhat.LoveCallBack());
    helper.attachToRecyclerView(recyclerView);
}