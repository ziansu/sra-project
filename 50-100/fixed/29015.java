@java.lang.Override
public void onStart() {
    super.onStart();
    android.os.Bundle args = getArguments();
    if (args != null) {
        if ((mVisitId) == 0) {
            mVisitId = args.getLong(com.vegnab.vegnab.VisitHeaderFragment.ARG_VISIT_ID, 0);
        }
    }
    getLoaderManager().initLoader(Loaders.VISIT_TO_EDIT, null, this);
    getLoaderManager().initLoader(Loaders.EXISTING_VISITS, null, this);
}