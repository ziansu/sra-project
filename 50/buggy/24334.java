@java.lang.Override
public void onDestroy() {
    mShoppingListScreen.setListeners(null);
    mListsActivity = null;
    mItemScreen = null;
    mShoppingListScreen = null;
    mListsScreen = null;
}