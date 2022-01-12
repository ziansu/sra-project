@android.annotation.TargetApi(value = Build.VERSION_CODES.HONEYCOMB)
@java.lang.Override
public void onDone(github.tmdb.bo.Film data) {
    final java.lang.String urlBackdrop = data.getBackdropPath(ApiTMDB.SizePoster.w1280);
    com.nostra13.universalimageloader.core.ImageLoader.getInstance().displayImage(urlBackdrop, backdrop);
}