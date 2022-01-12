@java.lang.Override
public void onActivityCreated(@android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    getLoaderManager().initLoader(net.brightron.jayaneetha.visitmihinthale.DetailFragment.DETAIL_LOADER, null, null);
    super.onActivityCreated(savedInstanceState);
}