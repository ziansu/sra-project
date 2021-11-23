private void setVolumeValue() {
    if ((mError) != null) {
        if (((mDialog) != null) && (mDialog.isShowing()))
            mDialog.dismiss();
        
        new de.neo.smarthome.mobile.tasks.AbstractTask.ErrorDialog(mContext, mError).show();
    }else {
        mVolume.setProgress(mVolumeValue);
    }
    mVolume.setOnSeekBarChangeListener(this);
}