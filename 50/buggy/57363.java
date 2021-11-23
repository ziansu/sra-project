public void backToHome(javafx.event.ActionEvent event) {
    appLibrarian.view.HomeWindow home = new appLibrarian.view.HomeWindow(appLibrarian.view.CreateReaderWindow.ctrl);
    try {
        home.show();
    } catch (java.io.IOException e) {
        appLibrarian.Util.showError(Util.Err.UNKNOWN);
        return ;
    }
    this.hide();
}