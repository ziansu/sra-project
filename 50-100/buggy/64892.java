@java.lang.Override
public void onBackPressed() {
    int count = (fragmentManager.getBackStackEntryCount()) - 1;
    int currentView = viewStack.pop();
    if (count == 0) {
        super.onBackPressed();
    }else {
        fragmentManager.popBackStack();
    }
    java.lang.String title = fragmentMap.get(currentView).getTitleString();
    setTitle(title);
}