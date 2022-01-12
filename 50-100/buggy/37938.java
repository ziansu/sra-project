private com.github.charmasaur.alpsinsects.ui.FragmentController.Screen getFromBack(int count) {
    int backStackSize = fragmentManager.getBackStackEntryCount();
    android.util.Log.i(com.github.charmasaur.alpsinsects.ui.FragmentController.TAG, ("Size: " + backStackSize));
    if (count > backStackSize) {
        return null;
    }
    if (count == backStackSize) {
        return root;
    }
    return backStackScreens.get(fragmentManager.getBackStackEntryAt(((backStackSize - count) - 1)).getId());
}