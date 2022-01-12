public void getNavDirectory() {
    javafx.stage.DirectoryChooser chooser = new javafx.stage.DirectoryChooser();
    chooser.setTitle("Choose Nav Directory");
    navHTML = chooser.showDialog(new javafx.stage.Stage());
    defaultDirectory = navHTML;
    outputLog.setText(navHTML.getAbsolutePath());
    footerDirectoryButton.setDisable(false);
}