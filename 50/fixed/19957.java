private void getLastId(java.util.List<me.zsj.interessant.model.ReplyList> replies) {
    if ((replies.size()) == 0)
        return ;
    
    lastId = replies.get(((replies.size()) - 1)).sequence;
}