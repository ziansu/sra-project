private static void clearDirectory(java.io.File directory) {
    for (java.io.File file : directory.listFiles()) {
        if (!(file.delete())) {
            android.util.Log.w(de.fuberlin.dessert.tasks.FileTasks.LOG_TAG, ("Could not delete the file: " + (file.getAbsolutePath())));
        }
    }
}