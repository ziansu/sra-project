private void setupListRecyclerView() {
    mDragListView.setLayoutManager(new android.support.v7.widget.LinearLayoutManager(getContext()));
    a00907981.comp3717.bcit.ca.tabtest.RecipeList.Ingred_List.ItemAdapter listAdapter = new a00907981.comp3717.bcit.ca.tabtest.RecipeList.Ingred_List.ItemAdapter(mItemArray, R.layout.list_item, R.id.image, false);
    mDragListView.setAdapter(listAdapter, true);
    mDragListView.setCanDragHorizontally(false);
    mDragListView.setCustomDragItem(new a00907981.comp3717.bcit.ca.tabtest.RecipeList.Ingred_List.MyDragItem(getContext(), R.layout.list_item));
}