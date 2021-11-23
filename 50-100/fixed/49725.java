private void setVolumeValue() {
    if (((mDialog) != null) && (mDialog.isShowing())) {
        if ((mError) != null) {
            mDialog.dismiss();
            new de.neo.smarthome.mobile.tasks.AbstractTask.ErrorDialog(mContext, mError).show();
        }else {
            mVolume.setProgress(mVolumeValue);
        }
        mVolume.setOnSeekBarChangeListener(this);
    }
}