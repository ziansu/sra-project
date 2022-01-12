@java.lang.Override
public void onActivityCreated(@android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onActivityCreated(savedInstanceState);
    getLoaderManager().initLoader(com.mx.kanjo.openclothes.ui.fragments.ListSalesFragment.LOADER_SALE, null, this);
}