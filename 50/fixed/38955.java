@java.lang.Override
protected void onDestroy() {
    super.onDestroy();
    tw.edu.ntu.fortour.ImageUtil.freeBitmap(bm);
    try {
        imgUtil.finalize();
    } catch (java.lang.Throwable e) {
    }
}