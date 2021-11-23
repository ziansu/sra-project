private com.github.charmasaur.alpsinsects.ui.FragmentController.Screen getFromBack(int count) {
    int backStackSize = fragmentManager.getBackStackEntryCount();
    if (count > backStackSize) {
        return null;
    }
    if (count == backStackSize) {
        return root;
    }
    return backStackScreens.get(fragmentManager.getBackStackEntryAt(((backStackSize - count) - 1)).getId());
}