public void start(java.lang.String tag) {
    this.uri = libraries.inlacou.com.imagegetter.ImageUtils.generateURI(context);
    this.tag = tag;
    checkExternalStoragePermission();
}