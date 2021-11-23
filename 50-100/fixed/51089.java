private void showFullScreen(int selection) {
    android.content.Intent i;
    i = new android.content.Intent("net.cloudapp.chooser.chooser.ImageFullscreen");
    if (selection == 1)
        i.putExtra("image", post.image1);
    else
        i.putExtra("image", post.image2);
    
    view.getContext().startActivity(i);
}