public static boolean restartLoader(final by.istin.android.xcore.fragment.CursorLoaderFragmentHelper.ICursorLoaderFragmentHelper cursorLoaderFragment) {
    if (((cursorLoaderFragment.getUri()) != null) && ((cursorLoaderFragment.getActivity()) != null)) {
        android.support.v4.app.LoaderManager lm = cursorLoaderFragment.getSupportLoaderManager();
        by.istin.android.xcore.utils.Log.xd(cursorLoaderFragment, lm);
        if (lm == null) {
            throw new java.lang.IllegalArgumentException("you need return LoaderManger from activity or fragment in the getSupportLoaderManager method");
        }
        lm.restartLoader(cursorLoaderFragment.getLoaderId(), null, cursorLoaderFragment);
        return true;
    }
    return false;
}