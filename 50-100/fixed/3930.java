@java.lang.Override
public void addCommentData(com.mashell.one.module.main.bean.Comment comment) {
    if ((currentPage) == 1)
        mEssayAdapter.setCommentItems(comment.data);
    else
        mEssayAdapter.addData(comment.data);
    
    mCommentRv.notifyDataChange(currentPage, comment.count);
    (currentPage)++;
}