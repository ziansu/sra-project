@java.lang.Override
public void onClick(android.view.View v) {
    if (mIsHasUpload) {
        mQrUploadTv.setTextColor(getResources().getColor(R.color.gray_character));
        uploadData();
        mIsHasUpload = !(mIsHasUpload);
    }
}