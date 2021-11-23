private void initUI() {
    com.zerohour.adapters.NoticeBoardItemAdapter noticeBoardItemAdapter = new com.zerohour.adapters.NoticeBoardItemAdapter(mParent, getNoticeBoardData());
    listViewNoticeBoard.setAdapter(noticeBoardItemAdapter);
    listViewNoticeBoard.setOnItemClickListener(this);
}