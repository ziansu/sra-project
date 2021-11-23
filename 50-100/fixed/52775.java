@java.lang.Override
public void onResume(es.ulpgc.eite.clean.mvp.sample.listDoneMaster.ListDoneMaster.PresenterToView view) {
    setView(view);
    android.util.Log.d(es.ulpgc.eite.clean.mvp.sample.listDoneMaster.TAG, "calling onResume()");
    if (configurationChangeOccurred()) {
        checkDeleteBtnVisibility();
        if (listClicked) {
            getView().startSelection();
            onCheckItems();
        }
    }
}