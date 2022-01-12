@java.lang.Override
public void onClick(android.view.View v) {
    dialog = com.vansuita.pickimage.dialog.PickImageDialog.build(new com.vansuita.pickimage.bundle.PickSetup().setTitle(getResources().getString(R.string.choose)).setCameraButtonText(getResources().getString(R.string.camera)).setGalleryButtonText(getResources().getString(R.string.gallery)).setCancelText(getResources().getString(R.string.cancel))).setOnPickResult(this).show(this);
}