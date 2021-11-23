@java.lang.Override
public void onResponse(com.android.volley.toolbox.ImageLoader.ImageContainer response, boolean arg1) {
    if ((mImageView.get()) != null) {
        android.widget.ImageView image = mImageView.get();
        if ((response.getBitmap()) != null) {
            image.startAnimation(android.view.animation.AnimationUtils.loadAnimation(mContext, R.anim.fade_in));
            image.setImageBitmap(response.getBitmap());
        }else {
            image.setImageResource(R.drawable.portrait_image_empty);
        }
    }
}