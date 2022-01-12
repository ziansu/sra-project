public void writeObject(java.lang.String fileName, java.io.Serializable obj) {
    java.io.File myFile = new java.io.File(context.getFilesDir(), fileName);
    try {
        myFile.createNewFile();
        java.io.ObjectOutputStream oos = new java.io.ObjectOutputStream(new java.io.FileOutputStream(myFile));
        oos.writeObject(obj);
        oos.flush();
        oos.close();
    } catch (java.io.IOException e) {
        e.printStackTrace();
        android.util.Log.e("Error", e.getMessage());
    }
}