@java.lang.Override
public void onClick(android.view.View view) {
    android.content.Intent intent = new android.content.Intent(this, de.huk_coburg.tdp.activities.GalleryActivity.class);
    startActivityForResult(intent, CallbackID.EXT_IMAGE);
}