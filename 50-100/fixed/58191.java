public int getListTopMessageId() {
    int topId;
    if ((backlogList.getChildCount()) == 0) {
        topId = -1;
    }else {
        topId = ((com.iskrembilen.quasseldroid.gui.fragments.ChatFragment.ViewHolder) (backlogList.getChildAt(0).getTag())).messageID;
    }
    return topId;
}