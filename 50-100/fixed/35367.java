public void stopReplication() {
    if ((tw.com.inx.ipm.data.IpmDataStoreManager.Pull) != null) {
        if ((mListener) != null)
            tw.com.inx.ipm.data.IpmDataStoreManager.Pull.removeChangeListener(mListener);
        else
            tw.com.inx.ipm.data.IpmDataStoreManager.Pull.removeChangeListener(this);
        
        tw.com.inx.ipm.data.IpmDataStoreManager.Pull.stop();
        tw.com.inx.ipm.data.IpmDataStoreManager.Pull = null;
        mListener = null;
    }
    if ((tw.com.inx.ipm.data.IpmDataStoreManager.Push) != null) {
        tw.com.inx.ipm.data.IpmDataStoreManager.Push.removeChangeListener(this);
        tw.com.inx.ipm.data.IpmDataStoreManager.Push.stop();
        tw.com.inx.ipm.data.IpmDataStoreManager.Push = null;
    }
}