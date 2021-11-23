public void startLoop(boolean flag) {
    if (flag) {
        if ((mBannerHandler) == null) {
            mBannerHandler = new com.oragee.banners.BannerView.BannerHandler(this);
        }
        mBannerHandler.sendEmptyMessageDelayed(com.oragee.banners.BannerView.MSG_LOOP, com.oragee.banners.BannerView.LOOP_INTERVAL);
    }else {
        if ((mBannerHandler) != null) {
            if (mBannerHandler.hasMessages(com.oragee.banners.BannerView.MSG_LOOP)) {
                mBannerHandler.removeMessages(com.oragee.banners.BannerView.MSG_LOOP);
            }
        }
    }
}