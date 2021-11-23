@java.lang.Override
public void onPickResult(com.vansuita.pickimage.bean.PickResult pickResult) {
    if ((pickResult.getError()) == null) {
        android.widget.Toast.makeText(this, pickResult.getPath(), Toast.LENGTH_LONG).show();
        java.lang.String path = com.wewow.utils.BitmapUtils.saveBitmap(this, com.wewow.FeedbackActivity.compressBySize(pickResult.getPath(), 720, 1280));
        asyncPutObjectFromLocalFile(path);
    }else {
        android.widget.Toast.makeText(this, pickResult.getError().getMessage(), Toast.LENGTH_LONG).show();
    }
}