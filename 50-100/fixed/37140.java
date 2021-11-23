@java.lang.Override
public java.util.List<com.museum.db.model.SiteImage> getImageByCommentIds(java.util.List<java.lang.Long> commentIds) {
    if ((commentIds.size()) == 0)
        return new java.util.ArrayList<com.museum.db.model.SiteImage>();
    
    org.hibernate.Session session = sessionFactory.getCurrentSession();
    org.hibernate.Query query = session.createQuery("from SiteImage where commentId in :commentIds");
    query.setParameterList("commentIds", commentIds);
    return query.list();
}