@java.lang.Override
public void onClick(android.view.View v) {
    startActivity(jzyu.github.photogallery.PhotoGalleryActivity.newIntent(this, jzyu.github.sample.gallery.MainActivity.sUrls));
}