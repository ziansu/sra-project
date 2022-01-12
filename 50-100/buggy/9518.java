private void quiteLiveByPurpose() {
    if ((com.tencent.qcloud.suixinbo.model.MySelfInfo.getInstance().getIdStatus()) == (com.tencent.qcloud.suixinbo.utils.Constants.HOST)) {
        if ((backDialog.isShowing()) == false)
            backDialog.show();
        
    }else {
        mLiveHelper.perpareQuitRoom(true);
        mEnterRoomHelper.quiteLive();
    }
}