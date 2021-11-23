@java.lang.Override
public void run() {
    if ((checkImgMsgCount) > 20) {
        intent.putExtra(ShowBigImage.EXTRA_TIMEOUT, true);
        chatPage.startActivity(intent);
    }else {
        checkImgMsgCount += 1;
        onClick(v);
    }
}