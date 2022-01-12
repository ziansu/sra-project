private void notifyFinished(final boolean forcedStop) {
    synchronized(this) {
        if ((mHandler) != null) {
            if (forcedStop) {
                mHandler.removeCallbacksAndMessages(null);
            }
            mHandler.post(new java.lang.Runnable() {
                @java.lang.Override
                public void run() {
                    if ((mResultListener) != null) {
                        mResultListener.onGenerateResult(mHowMany, mTotalGenerated, forcedStop);
                    }
                    if ((mService) != null) {
                        mService.onGeneratingFinished(forcedStop);
                    }
                }
            });
        }
    }
}