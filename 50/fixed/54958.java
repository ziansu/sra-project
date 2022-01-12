public int getQQWeChatShowCount() {
    if ((mQQWeChatShowCount) != null) {
        return mQQWeChatShowCount.getInt("qqwechatshowcount", (-1));
    }
    return -1;
}