private void weiBoAction() {
    try {
        if (!(checkWBInstalled())) {
            android.widget.Toast.makeText(this, R.string.weiBo_not_installed, Toast.LENGTH_SHORT).show();
        }else {
            sendMessage(true, true, false, false, false, false);
            setVisible();
        }
    } catch (com.sina.weibo.sdk.exception.WeiboException e) {
        e.printStackTrace();
        android.widget.Toast.makeText(mContext, e.getMessage(), Toast.LENGTH_SHORT).show();
    }
}