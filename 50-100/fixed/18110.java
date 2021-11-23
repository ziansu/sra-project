@java.lang.Override
public void onClick(android.view.View view) {
    imagePopup.initiatePopup(imageView.getDrawable());
    android.widget.ImageView closeBtn = new android.widget.ImageView(this);
    if ((Build.VERSION.SDK_INT) >= (Build.VERSION_CODES.LOLLIPOP)) {
        closeBtn.setImageDrawable(getDrawable(R.drawable.x));
    }
}