private void releaseBitmap() {
    for (int i = 1; i <= 8; i++) {
        dot_array[i].recycle();
    }
    passBarBg.recycle();
    noPassBarBg.recycle();
    skipBarBg.recycle();
    legend.recycle();
    cursor.recycle();
    java.lang.System.gc();
}