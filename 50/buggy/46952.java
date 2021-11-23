@java.lang.Override
protected void onResume() {
    super.onResume();
    updateList();
    viewPagerFragment.setUpViewPager(getItemIDs(shoppingListItemController.getShoppingListItems()), listId);
}