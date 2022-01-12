public void addRecord(@android.support.annotation.NonNull
final Model model) {
    android.util.Log.d(LOG_TAG, java.lang.String.format("Adding %s record to database: ", model.getClass().getSimpleName()));
    synchronized(getReplaceStatement()) {
        setBindings(getReplaceStatement(), model).execute();
    }
}