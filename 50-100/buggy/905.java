private java.io.File[] checkFiles() {
    java.io.File hrvDirectory;
    hrvDirectory = new java.io.File(android.os.Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES), isst.fraunhofer.de.ompi.adapter.HRVAdapter.hrvPackage);
    if ((hrvDirectory.listFiles()) == null)
        hrvDirectory = new java.io.File(android.os.Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOCUMENTS), isst.fraunhofer.de.ompi.adapter.HRVAdapter.hrvPackage);
    
    java.io.File[] files = hrvDirectory.listFiles();
    android.util.Log.d("Files", ("Path: " + (hrvDirectory.getPath())));
    return files;
}