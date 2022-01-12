@java.lang.Override
public void handle(javafx.event.ActionEvent e) {
    if ((localSelected) != null) {
        java.lang.System.out.println((("Uploading " + (localSelected)) + "..."));
        sample.FileShareClient fsc = new sample.FileShareClient();
        fsc.Upload(localFolder.getAbsolutePath(), localSelected);
        fsc = new sample.FileShareClient();
        fsc.Dir(serverFiles);
    }
}