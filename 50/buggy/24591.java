private boolean isExternalStorageAvalaible() {
    java.lang.String state = android.os.Environment.getExternalStorageState();
    if (state.equals(Environment.MEDIA_MOUNTED))
        return true;
    else
        return false;
    
}