public void getNavDirectory() {
    javafx.stage.DirectoryChooser chooser = new javafx.stage.DirectoryChooser();
    chooser.setTitle("Choose Nav Directory");
    navHTML = chooser.showDialog(new javafx.stage.Stage());
    defaultDirectory = navHTML;
    java.lang.String temp = (outputLog.getText()) + "\n";
    outputLog.setText((temp + (navHTML.getAbsolutePath())));
    footerDirectoryButton.setDisable(false);
}