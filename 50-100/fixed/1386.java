private void setLayoutParams(android.widget.ImageView imageView, android.view.ViewGroup.LayoutParams lp, int scaledWidth, int scaledHeight) {
    if (((lp.width) != scaledWidth) || ((lp.height) != scaledHeight)) {
        lp.width = scaledWidth;
        lp.height = scaledHeight;
        onUpdateView();
    }
}