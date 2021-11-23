@java.lang.Override
protected void onStart() {
    com.bumptech.glide.Glide.with(image.getContext()).load(imageurl).dontAnimate().into(image);
    super.onStart();
}