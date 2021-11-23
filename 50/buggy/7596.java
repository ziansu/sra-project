@java.lang.Override
public boolean onResourceReady(com.bumptech.glide.load.resource.drawable.GlideDrawable resource, com.bumptech.glide.load.model.GlideUrl model, com.bumptech.glide.request.target.Target<com.bumptech.glide.load.resource.drawable.GlideDrawable> target, boolean isFromMemoryCache, boolean isFirstResource) {
    if (!(category.isAvailable))
        categoryImage.setAlpha(0.2F);
    
    return false;
}