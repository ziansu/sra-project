@java.lang.Override
public void onImageClick(java.lang.String url, int position, android.view.View imageView) {
    com.orhanobut.logger.Logger.d(("点击了=" + position));
    android.content.Intent intent = new android.content.Intent(context, cn.bluemobi.dylan.photoview.ImagePagerActivity.class);
    java.lang.String[] arr = new java.lang.String[urls.size()];
    arr = urls.toArray(arr);
    intent.putExtra(ImagePagerActivity.EXTRA_IMAGE_URLS, arr);
    intent.putExtra(ImagePagerActivity.EXTRA_IMAGE_INDEX, position);
    startActivity(intent);
    overridePendingTransition(R.anim.zoom_ente, R.anim.zoom_exit);
}