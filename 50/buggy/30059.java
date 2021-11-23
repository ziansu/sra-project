public void start(java.lang.String tag) {
    this.uri = libraries.inlacou.com.imagegetter.ImageUtils.generateURI();
    this.tag = tag;
    checkExternalStoragePermission();
}