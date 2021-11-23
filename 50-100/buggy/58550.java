public void setLabel(java.lang.String label, android.content.SharedPreferences labelFile) {
    java.lang.String fileName = getFileName();
    mLabel = com.example.jgreenb2.myselfie.SelfieItem.formatFileToLabel(fileName);
    android.content.SharedPreferences.Editor editor = labelFile.edit();
    editor.putString(fileName, mLabel);
    editor.commit();
    mLabel = label;
}