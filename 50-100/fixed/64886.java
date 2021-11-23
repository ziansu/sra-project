protected void onRestart() {
    super.onRestart();
    if ((com.bairuitech.anychat.AnyChatCoreSDK.GetSDKOptionInt(AnyChatDefine.BRAC_SO_VIDEOSHOW_DRIVERCTRL)) == (com.bairuitech.anychat.AnyChatDefine.VIDEOSHOW_DRIVER_JAVA)) {
        int index = anychat.mVideoHelper.bindVideo(otherView.getHolder());
        anychat.mVideoHelper.SetVideoUser(index, userID);
    }
    refreshAV();
    bOnPaused = false;
}