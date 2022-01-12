private static boolean clearDirectory(java.io.File directory) {
    boolean result = true;
    for (java.io.File file : directory.listFiles()) {
        if (!(file.delete())) {
            android.util.Log.w(de.fuberlin.dessert.tasks.FileTasks.LOG_TAG, ("Could not delete the file: " + (file.getAbsolutePath())));
            result = false;
        }
    }
    return result;
}