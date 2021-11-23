@java.lang.Override
public void onScreenStarted() {
    android.util.Log.d(es.ulpgc.eite.clean.mvp.sample.category.TAG, "calling onScreenStarted()");
    if (isViewRunning()) {
        getView().setLabelSearch(getModel().getSearchLabel());
        getView().setAddLabel(getModel().getAddLabel());
    }
}