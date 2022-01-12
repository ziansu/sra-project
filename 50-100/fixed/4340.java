@java.lang.Override
public void onClick(final android.view.View v) {
    switch (v.getId()) {
        case R.id.button_set :
            mClient.putData((((com.j.jface.Const.DATA_PATH) + "/") + (com.j.jface.Const.DATA_KEY_ADHOC)), Const.DATA_KEY_ADHOC, mDataEdit.getText().toString());
            break;
        case R.id.button_now :
            mOffset = 0;
            tick();
            updateOffset(0);
            mHandler.removeMessages(com.j.jface.feed.TabDebugTools.MSG_UPDATE_TIME);
            mHandler.sendEmptyMessage(com.j.jface.feed.TabDebugTools.MSG_UPDATE_TIME);
        default :
            updateFences();
    }
}