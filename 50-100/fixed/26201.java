@java.lang.Override
public void onClick(android.view.View v) {
    if ((pickGridAdapter) == null) {
        return ;
    }
    if (!(pickGridAdapter.getSelectPath().isEmpty())) {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra(PickConfig.INTENT_IMG_LIST_SELECT, ((java.io.Serializable) (pickGridAdapter.getSelectPath())));
        setResult(PickConfig.PICK_PHOTO_DATA, intent);
        finish();
    }
}