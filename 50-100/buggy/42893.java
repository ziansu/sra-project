@java.lang.Override
public void writeToReadmetxft(java.lang.String s) throws java.io.IOException {
    java.io.File root = new java.io.File(android.os.Environment.getExternalStorageDirectory(), "Notes");
    if (!(root.exists()))
        root.mkdirs();
    
    java.io.File filepath = new java.io.File(root, "readme.txt");
    java.io.FileWriter writer = new java.io.FileWriter(filepath);
    writer.append(s);
    writer.flush();
    writer.close();
}