private void removePhotoDone(android.os.Bundle data) {
    com.extenprise.mapp.medico.util.Utility.showProgressDialog(this, false);
    if (data.getBoolean("status")) {
        com.extenprise.mapp.medico.util.Utility.showMessage(this, R.string.msg_photo_removed);
        mImgView.setBackgroundResource(R.drawable.dr_avatar);
        com.extenprise.mapp.medico.service.data.ServiceProvider serviceProvider = com.extenprise.mapp.medico.data.WorkingDataStore.getBundle().getParcelable("servProv");
        serviceProvider.setPhoto(null);
        mImgView.setImageBitmap(null);
    }else {
        com.extenprise.mapp.medico.util.Utility.showMessage(this, R.string.some_error);
    }
}