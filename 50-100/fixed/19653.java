@java.lang.Override
public void onFailed(int code) {
    if (code == (com.netease.nimlib.sdk.ResponseCode.RES_CHATROOM_BLACKLIST)) {
        android.widget.Toast.makeText(this, com.summer.utils.StringUtil.getXmlResource(this, R.string.push_video_nim_black_list), Toast.LENGTH_SHORT).show();
    }else {
        com.summer.logger.XLog.i(("enter chat room failed, code=" + code));
        android.widget.Toast.makeText(this, ("enter chat room failed, code=" + code), Toast.LENGTH_SHORT).show();
    }
    finish();
}