public weibo4j.model.CommentWapper readPagingCommentsOfWeibo(java.lang.String weiboId, weibo4j.model.Paging pager, weibo4j.Comments cm, weibo4j.wang.db.DataWrapper dw) throws weibo4j.model.WeiboException {
    weibo4j.model.CommentWapper cw = cm.getCommentById(weiboId, pager, 0);
    java.util.List<weibo4j.model.Comment> comments = cw.getComments();
    for (weibo4j.model.Comment c : comments) {
        dw.saveComment(c);
    }
    return cw;
}