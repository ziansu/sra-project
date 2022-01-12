public void refreshNotify() {
    if (!(com.xindawn.util.CommonUtil.checkNetworkState(mContext))) {
        return ;
    }
    if (!(mStartSuccess)) {
        stopEngine();
        try {
            java.lang.Thread.sleep(200);
        } catch (java.lang.InterruptedException e) {
            e.printStackTrace();
        }
        boolean ret = startEngine();
        if (ret) {
            mStartSuccess = true;
        }
    }
}