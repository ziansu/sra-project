public void clickRenameLibrary(javafx.event.ActionEvent actionEvent) {
    newLibraryTitle = textFieldForNewLibraryTitle.getText();
    if (newLibraryTitle.equals(oldLibraryTitle)) {
        com.devprosony.Main.stdOut.println("newLibraryTitle = oldLibraryTitle");
    }else {
        com.devprosony.Main.stdOut.println(("newLibraryTitle: " + (newLibraryTitle)));
        renameLibraryTitle(oldLibraryTitle, newLibraryTitle);
        dialogRenameLibraryStage.close();
    }
}