private void firstBloodPartII() {
    clearCallbacks();
    mUIRunnable = new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            ((spring15.ec551.fpgacontroller.activities.MainActivity) (mContext)).runOnUiThread(new java.lang.Runnable() {
                @java.lang.Override
                public void run() {
                    if (isFireHeldDown) {
                        shootLaser();
                    }
                }
            });
            ramboMode();
        }
    };
    if (isAmmoEmpty())
        reload();
    else
        mLaserHandler.postDelayed(mUIRunnable, QUARTER_SEC);
    
}