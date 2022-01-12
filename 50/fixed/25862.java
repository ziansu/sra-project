@java.lang.Override
public void onCompleted(java.lang.Exception e, android.widget.ImageView result) {
    if (e != null)
        return ;
    
    loaded = true;
    progressbar.setVisibility(View.GONE);
    attacher = new uk.co.senab.photoview.PhotoViewAttacher(imageView);
    attacher.setMaximumScale(25);
}