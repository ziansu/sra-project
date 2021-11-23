@java.lang.Override
public void run() {
    try {
        java.io.FileInputStream fIn = new java.io.FileInputStream(file);
        mDBApi.putFile(fileName, fIn, file.length(), null, null);
        android.util.Log.i(edu.sdsu.cs.sharepic.model.Dropbox.TAG, "Uploaded");
    } catch (com.dropbox.client2.exception.DropboxException | java.io.FileNotFoundException e) {
        android.util.Log.e(edu.sdsu.cs.sharepic.model.Dropbox.TAG, e.getMessage());
    }
}