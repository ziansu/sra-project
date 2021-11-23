@java.lang.Override
public void onLoadingFailed(java.lang.String imageUri, android.view.View view, com.nostra13.universalimageloader.core.assist.FailReason failReason) {
    imageView.setImageResource(R.drawable.notification_error);
    item.conError = true;
    item.save();
}