private static java.lang.String getExternalSDCardDirectory(android.content.Context context) {
    java.lang.String strSDCardPath = java.lang.System.getenv("SECONDARY_STORAGE");
    java.io.File[] externalFilesDirs = context.getExternalFilesDirs(null);
    for (java.io.File externalFilesDir : externalFilesDirs) {
        if (externalFilesDir == null)
            continue;
        
        if (strSDCardPath == null)
            return null;
        
        if (externalFilesDir.getAbsolutePath().contains(strSDCardPath))
            return (externalFilesDir.getAbsolutePath()) + (java.io.File.separator);
        
    }
    return null;
}