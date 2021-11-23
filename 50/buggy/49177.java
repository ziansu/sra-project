@java.lang.Override
public void onBackPressed() {
    org.looa.vision.PrismSE.getInstant().finish(imageView);
    org.looa.vision.PrismSE.getInstant().overridePendingTransition(0, android.R.anim.fade_out);
}