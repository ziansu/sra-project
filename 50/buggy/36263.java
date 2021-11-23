@java.lang.Override
public android.os.ParcelFileDescriptor openFile(android.net.Uri uri, java.lang.String mode) throws java.io.FileNotFoundException {
    android.util.Log.i("Hier", "open");
    return super.openFile(uri, mode);
}