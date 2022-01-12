@java.lang.Override
protected void onDestroy() {
    super.onDestroy();
    if ((((requestHandle) != null) && (!(requestHandle.isCancelled()))) && (!(requestHandle.isFinished()))) {
        org.esec.mcg.androidu2fsimulator.token.utils.logger.LogUtils.d(("Reqeust Handle cancel" + (requestHandle.cancel(true) ? " succeeded" : " failed")));
        synchronized(org.esec.mcg.androidu2fsimulator.token.U2FTokenActivity.lock) {
            org.esec.mcg.androidu2fsimulator.token.U2FTokenActivity.USER_PRESENCE = true;
            org.esec.mcg.androidu2fsimulator.token.U2FTokenActivity.lock.notify();
        }
    }else {
        org.esec.mcg.androidu2fsimulator.token.utils.logger.LogUtils.d("Request Handle already non-cancellable");
    }
}