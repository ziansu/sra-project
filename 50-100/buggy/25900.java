private void removePhotoDone(android.os.Bundle data) {
    com.extenprise.mapp.medico.util.Utility.showProgressDialog(this, false);
    if (data.getBoolean("status")) {
        com.extenprise.mapp.medico.util.Utility.showMessage(this, R.string.msg_photo_removed);
        mCust = com.extenprise.mapp.medico.data.WorkingDataStore.getBundle().getParcelable("customer");
        mCust.setPhoto(null);
    }
    setPhoto();
}