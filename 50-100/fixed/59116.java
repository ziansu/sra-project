@java.lang.Override
public final void onCreate(final android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    mIHostingActivity = ((com.nbossard.packlist.gui.IMassImportFragmentActivity) (getActivity()));
    android.os.Bundle args = getArguments();
    mTrip = null;
    if (args != null) {
        mTrip = ((com.nbossard.packlist.model.Trip) (args.getSerializable(com.nbossard.packlist.gui.MassImportFragment.BUNDLE_PAR_TRIP)));
    }else {
        android.util.Log.e(com.nbossard.packlist.gui.MassImportFragment.TAG, "onCreate() : This should never occur");
    }
    if ((mTrip) == null) {
        mTrip = new com.nbossard.packlist.model.Trip();
    }
}