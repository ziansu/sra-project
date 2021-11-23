@java.lang.Override
public void onSuccess(java.lang.Void result) {
    de.hdm.itprojekt.noteit.client.NoteitCellBrowser.updateNotebooks();
    de.hdm.itprojekt.noteit.client.Homepage.hideView();
}