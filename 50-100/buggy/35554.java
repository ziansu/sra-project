public boolean onBackPressed() {
    if ((fragmentManager.getBackStackEntryCount()) > 0) {
        boolean handledByFragment = false;
        if ((currentFragent) instanceof es.shyri.materialtoolbar.MaterialToolbarSupplier) {
            handledByFragment = ((es.shyri.materialtoolbar.MaterialToolbarSupplier) (currentFragent)).onBackPressed();
        }
        if (!handledByFragment) {
            fragmentManager.popBackStack();
        }
        return true;
    }else {
        return false;
    }
}