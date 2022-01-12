@java.lang.Override
public void onBackStackChanged() {
    java.lang.System.out.println(("entries: " + (getFragmentManager().getBackStackEntryCount())));
    if (backStackCalledOnce) {
        updateAutocompleteAdapter();
        getFragmentManager().removeOnBackStackChangedListener(this);
        backStackCalledOnce = false;
    }else {
        backStackCalledOnce = true;
    }
}