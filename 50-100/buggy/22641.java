@java.lang.Override
public void onTasteChanged() {
    java.util.List<android.support.v4.app.Fragment> allFragments = getSupportFragmentManager().getFragments();
    if (allFragments != null) {
        for (android.support.v4.app.Fragment fragment : allFragments) {
            try {
                it.scripto.primetime4u.utils.RefreshFragment refreshFragment = ((it.scripto.primetime4u.utils.RefreshFragment) (fragment));
                refreshFragment.refresh();
            } catch (java.lang.ClassCastException ignored) {
            }
        }
    }
}