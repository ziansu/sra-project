private void countdown(final int time) {
    if ((mHandler) != null) {
        mTvGetCode.setText(getString(R.string.seconds_count_down, time));
        mTvGetCode.setEnabled(false);
        mHandler.postDelayed(new java.lang.Runnable() {
            @java.lang.Override
            public void run() {
                if (time < 1) {
                    mTvGetCode.setEnabled(true);
                    mTvGetCode.setText(getString(R.string.get_verification_code));
                }else {
                    countdown((time - 1));
                }
            }
        }, 1000);
    }
}