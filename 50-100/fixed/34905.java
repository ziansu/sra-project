@java.lang.Override
public void onClick(android.view.View v) {
    switch (v.getId()) {
        case R.id.share_wx :
            com.sctdroid.app.textemoji.businessUtils.ShareUtils.saveAndShare(getContext(), mShareable, ShareUtils.SharePlatform.WECHAT);
            break;
        case R.id.share_qq :
            com.sctdroid.app.textemoji.businessUtils.ShareUtils.saveAndShare(getContext(), mShareable, ShareUtils.SharePlatform.QQ);
            break;
        case R.id.share_other :
            com.sctdroid.app.textemoji.businessUtils.ShareUtils.saveAndShare(getContext(), mShareable, ShareUtils.SharePlatform.OTHERS);
            break;
    }
}