private void uploadPhotoDone(android.os.Bundle data) {
    com.extenprise.mapp.medico.util.Utility.showProgressDialog(this, false);
    if (data.getBoolean("status")) {
        com.extenprise.mapp.medico.util.Utility.showMessage(this, R.string.msg_upload_photo);
        mCust = com.extenprise.mapp.medico.data.WorkingDataStore.getBundle().getParcelable("customer");
        mCust.setPhoto(com.extenprise.mapp.medico.util.Utility.getBytesFromBitmap(((android.graphics.drawable.BitmapDrawable) (mImgView.getDrawable())).getBitmap()));
    }
    setPhoto();
}