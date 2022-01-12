public boolean hideQuickReply() {
    if (((quickReply) != null) && ((quickReply.getVisibility()) == (android.view.View.VISIBLE))) {
        mReplyTextTv.setText("");
        quickReply.setVisibility(View.INVISIBLE);
        mFam.setVisibility(View.VISIBLE);
        return true;
    }
    return false;
}