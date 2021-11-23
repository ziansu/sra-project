private void uploadPhotoDone(android.os.Bundle data) {
    if (data.getBoolean("status")) {
        com.extenprise.mapp.medico.util.Utility.showMessage(this, R.string.msg_upload_photo);
        com.extenprise.mapp.medico.service.data.ServiceProvider serviceProvider = com.extenprise.mapp.medico.data.WorkingDataStore.getBundle().getParcelable("servProv");
        serviceProvider.setPhoto(com.extenprise.mapp.medico.util.Utility.getBytesFromBitmap(((android.graphics.drawable.BitmapDrawable) (mImgView.getDrawable())).getBitmap()));
    }else {
        setPhoto();
    }
}