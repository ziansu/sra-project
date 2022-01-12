@java.lang.Override
public void onBackPressed() {
    int count = getFragmentManager().getBackStackEntryCount();
    int currentView = viewStack.pop();
    if (count == 0) {
        super.onBackPressed();
    }else {
        getFragmentManager().popBackStack();
    }
    java.lang.String title = fragmentMap.get(currentView).getTitleString();
    setTitle(title);
}