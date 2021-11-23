@java.lang.Override
public void addComment(com.hska.localgram.model.Comment comment) {
    getCurrentSession().save(comment);
}