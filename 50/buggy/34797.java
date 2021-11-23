private boolean isExist(java.lang.String name) {
    android.util.Log.e("checking", name);
    return (sqLiteHandler.getCategory(name.toUpperCase())) != null;
}