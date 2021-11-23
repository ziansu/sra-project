private static com.acbelter.android1.homework2.ImageLoader.LoadImageTask getLoadImageTask(android.widget.ImageView imageView) {
    if (imageView != null) {
        android.graphics.drawable.Drawable drawable = imageView.getDrawable();
        if (drawable instanceof com.acbelter.android1.homework2.ImageLoader.ImageStub) {
            com.acbelter.android1.homework2.ImageLoader.ImageStub imageStub = ((com.acbelter.android1.homework2.ImageLoader.ImageStub) (drawable));
            return imageStub.getLoadTask();
        }
    }
    return null;
}