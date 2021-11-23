public void dealBattle(android.graphics.Bitmap image) {
    if (mIsIdle) {
        mIsIdle = false;
        android.os.Message msg = android.os.Message.obtain();
        msg.what = os.ransj.thundership.actions.BattleActor.MSG_ID_IMAGE;
        msg.obj = image;
        mHandler.sendMessage(msg);
    }else {
        image.recycle();
    }
}