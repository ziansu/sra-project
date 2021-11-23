private void showWindow(uniol.aptgui.mainwindow.WindowId id) {
    uniol.aptgui.internalwindow.InternalWindowPresenter window = internalWindows.remove(id);
    getView().addInternalWindow(window.getView());
    window.focus();
}