public void appendComment(com.xiangyixie.picshouse.model.Comment comment) {
    if (!(mOwnCommentArray)) {
        mOwnCommentArray = true;
        mCommentArray = new java.util.ArrayList(mCommentArray);
    }
    mCommentArray.add(comment);
    notifyDataSetChanged();
}