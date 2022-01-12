@java.lang.Override
public void handle(javafx.event.ActionEvent e) {
    java.lang.System.out.println((("Downloading " + (serverSelected)) + "..."));
    sample.FileShareClient fsc = new sample.FileShareClient();
    fsc.Download(localFolder.getAbsolutePath(), serverSelected);
    java.lang.System.out.println(((("Uploaded successfully to " + (fsc.SERVER_ADDRESS)) + ":") + (fsc.SERVER_PORT)));
    refreshLocalList();
}