@java.lang.Override
public void onViewCreated(android.view.View view, @android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onViewCreated(view, savedInstanceState);
    mAdapter = new com.rukiasoft.androidapps.cocinaconroll.ui.EditRecipeRecyclerViewAdapter(getActivity(), recipeItem.getIngredients(), this);
    recyclerView.setHasFixedSize(true);
    recyclerView.setAdapter(mAdapter);
    recyclerView.setLayoutManager(new android.support.v7.widget.LinearLayoutManager(getActivity()));
    android.support.v7.widget.helper.ItemTouchHelper.Callback callback = new com.rukiasoft.androidapps.cocinaconroll.dragandswipehelper.SimpleItemTouchHelperCallback(mAdapter);
    mItemTouchHelper = new android.support.v7.widget.helper.ItemTouchHelper(callback);
    mItemTouchHelper.attachToRecyclerView(recyclerView);
}