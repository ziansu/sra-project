@java.lang.Override
public void onBackPressed() {
    int count = (fragmentManager.getBackStackEntryCount()) - 1;
    if (!(viewStack.isEmpty())) {
        int currentView = viewStack.pop();
        java.lang.String title = fragmentMap.get(currentView).getTitleString();
        setTitle(title);
    }else {
        super.onBackPressed();
    }
    if (count == 0) {
        super.onBackPressed();
    }else {
        fragmentManager.popBackStack();
    }
}