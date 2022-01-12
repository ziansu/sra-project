private void addBlurImage() {
    android.graphics.Bitmap bm = com.daimajia.androidviewhover.tools.Blur.apply(getContext(), com.daimajia.androidviewhover.tools.Util.getViewBitmap(this), mBlurRadius);
    android.widget.ImageView im = new android.widget.ImageView(getContext());
    im.setImageBitmap(bm);
    mBlurImage = im;
    this.addView(im);
}