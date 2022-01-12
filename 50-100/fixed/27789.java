public java.util.List<java.io.File> addUpperItem(java.util.List<java.io.File> oldList) {
    if (android.text.TextUtils.isEmpty(mCurrentPath)) {
        throw new java.lang.RuntimeException("mCurrentPath is null!");
    }
    java.io.File upperFile = new java.io.File(mCurrentPath).getParentFile();
    oldList.add(0, upperFile);
    return oldList;
}