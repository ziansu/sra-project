@java.lang.Override
public void onClick(android.content.DialogInterface dialogInterface, int i) {
    java.io.File oldFile = new java.io.File(keepFileName);
    oldFile.renameTo(file);
    fragmentMedia.close();
    fragmentMedia.open(file.getPath());
    keepFileName = null;
}