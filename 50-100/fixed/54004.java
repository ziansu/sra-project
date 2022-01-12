@java.lang.Override
public void handle(javafx.event.ActionEvent e) {
    if ((serverSelected) != null) {
        java.lang.System.out.println((("Downloading " + (serverSelected)) + "..."));
        sample.FileShareClient fsc = new sample.FileShareClient();
        fsc.Download(localFolder.getAbsolutePath(), serverSelected);
        refreshLocalList();
    }
}