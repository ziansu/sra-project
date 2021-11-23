@com.alibaba.fastjson.annotation.JSONField(serialize = false)
public java.util.Iterator<? extends limeng32.mirage.account.persist.face.CommentFace> getIteratorComment() {
    if ((comment) == null)
        comment = new java.util.LinkedHashSet<limeng32.mirage.account.persist.face.CommentFace>();
    
    return comment.iterator();
}