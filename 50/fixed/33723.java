public void addData(java.util.List<com.mashell.one.module.main.bean.CommentItem> mCommentItems) {
    if (null == (this.mCommentItems))
        this.mCommentItems = new java.util.ArrayList<>();
    
    this.mCommentItems.addAll(mCommentItems);
}