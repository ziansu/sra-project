@java.lang.Override
public void onResp(com.tencent.mm.sdk.modelbase.BaseResp resp) {
    switch (resp.errCode) {
        case BaseResp.ErrCode.ERR_OK :
            android.widget.Toast.makeText(this, "分享成功", Toast.LENGTH_LONG).show();
            finish();
            break;
        case BaseResp.ErrCode.ERR_USER_CANCEL :
            android.widget.Toast.makeText(this, "分享取消 ", Toast.LENGTH_LONG).show();
            finish();
            break;
        case BaseResp.ErrCode.ERR_AUTH_DENIED :
            android.widget.Toast.makeText(this, "分享拒绝", Toast.LENGTH_LONG).show();
            finish();
            break;
    }
}