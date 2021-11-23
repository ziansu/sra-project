private void setLayoutParams(android.widget.ImageView imageView, android.view.ViewGroup.LayoutParams lp, int scaledWidth, int scaledHeight) {
    if (((lp.width) != scaledWidth) || ((lp.height) != scaledHeight)) {
        com.hyphenate.util.EMLog.e(com.hyphenate.easeui.widget.chatrow.TAG, "set layout params");
        lp.width = scaledWidth;
        lp.height = scaledHeight;
        onUpdateView();
    }
}