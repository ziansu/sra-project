protected final boolean replace(android.support.v4.app.Fragment oldFragment, int idx) {
    boolean retval = false;
    if ((jsonList.size()) > idx) {
        android.support.v4.app.Fragment newFragment = new com.khallware.apis.EntityFragment();
        provision(newFragment, idx);
        retval = replace(oldFragment, newFragment);
    }
    return retval;
}