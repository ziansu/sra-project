@java.lang.Override
public void handle(javafx.event.ActionEvent e) {
    java.lang.System.out.println((("Uploading " + (localSelected)) + "..."));
    sample.FileShareClient fsc = new sample.FileShareClient();
    fsc.Upload(localFolder.getAbsolutePath(), localSelected);
    fsc = new sample.FileShareClient();
    java.lang.System.out.println(((("Uploaded successfully to " + (fsc.SERVER_ADDRESS)) + ":") + (fsc.SERVER_PORT)));
    fsc.Dir(serverFiles);
}