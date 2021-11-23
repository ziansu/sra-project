@java.lang.Override
protected void setResource(android.graphics.Bitmap resource) {
    android.support.v4.graphics.drawable.RoundedBitmapDrawable circularBitmapDrawable = android.support.v4.graphics.drawable.RoundedBitmapDrawableFactory.create(mContext.getResources(), resource);
    circularBitmapDrawable.setCircular(true);
    homeVH.ivAuthor.setImageDrawable(circularBitmapDrawable);
}