@java.lang.Override
public void onBackStackChanged() {
    java.lang.System.out.println(("entries: " + (getFragmentManager().getBackStackEntryCount())));
    if ((getFragmentManager().getBackStackEntryCount()) == 1) {
        updateAutocompleteAdapter();
        getFragmentManager().removeOnBackStackChangedListener(this);
    }
}