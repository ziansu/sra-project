public void startListen() {
    if ((mOnComboListener) != null) {
        mView.setOnClickListener(new android.view.View.OnClickListener() {
            @java.lang.Override
            public void onClick(android.view.View v) {
                long thisClickTime = java.lang.System.currentTimeMillis();
                if ((thisClickTime - (lastClickTime)) <= (mMaxInterval)) {
                    (mComboCount)++;
                }else {
                    mComboCount = 0;
                }
                lastClickTime = thisClickTime;
                mOnComboListener.onCombo(v, mComboCount);
            }
        });
    }
}