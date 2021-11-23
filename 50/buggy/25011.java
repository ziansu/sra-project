public void screenShot(java.lang.String shotName) {
    try {
        com.alibaba.weex.util.ScreenShot.shoot(WXPageActivity.wxPageActivityInstance, shotName);
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}