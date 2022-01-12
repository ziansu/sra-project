public void updateUI() {
    nz.ac.unitec.restaurantordersystem.DishLab dishLab = nz.ac.unitec.restaurantordersystem.DishLab.get(getActivity());
    java.util.List<nz.ac.unitec.restaurantordersystem.Dish> dishes = dishLab.getDishes();
    android.util.Log.d(nz.ac.unitec.restaurantordersystem.DishListFragment.TAG, "updateUI");
    if ((mAdapter) == null) {
        mAdapter = new nz.ac.unitec.restaurantordersystem.DishListFragment.DishAdapter(dishes);
        mDishRecyclerView.setAdapter(mAdapter);
    }else {
        mAdapter.setDishes(dishes);
        mAdapter.notifyDataSetChanged();
        android.util.Log.d(nz.ac.unitec.restaurantordersystem.DishListFragment.TAG, "set dishes");
    }
    updateSubtitle();
}