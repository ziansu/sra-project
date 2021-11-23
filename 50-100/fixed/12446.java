private void addBlurImage() {
    android.graphics.Bitmap b = com.daimajia.androidviewhover.tools.Util.getViewBitmap(this);
    if (b == null)
        return ;
    
    android.graphics.Bitmap bm = com.daimajia.androidviewhover.tools.Blur.apply(getContext(), b);
    android.widget.ImageView im = new android.widget.ImageView(getContext());
    im.setImageBitmap(bm);
    mBlurImage = im;
    this.addView(im);
}