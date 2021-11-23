public viewer.model.Tag createTag(java.lang.String title) {
    org.hibernate.Session session = sessionFactory.getCurrentSession();
    viewer.model.Tag tag = new viewer.model.Tag(title);
    session.save(tag);
    return tag;
}