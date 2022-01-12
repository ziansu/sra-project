@java.lang.Override
public void onClick(android.view.View v) {
    if (!(pickGridAdapter.getSelectPath().isEmpty())) {
        android.content.Intent intent = new android.content.Intent();
        intent.setClass(this, com.werb.pickphotoview.PickPhotoPreviewActivity.class);
        intent.putExtra(PickConfig.INTENT_IMG_PATH, pickGridAdapter.getSelectPath().get(0));
        intent.putExtra(PickConfig.INTENT_IMG_LIST, ((java.io.Serializable) (allPhotos)));
        startActivity(intent);
    }
}