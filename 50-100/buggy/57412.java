@java.lang.Override
public java.util.Set<edu.temple.tutrucks.Tag> loadTags() {
    org.hibernate.Session session = edu.temple.tutrucks.HibernateUtil.getSessionFactory().openSession();
    session.beginTransaction();
    org.hibernate.Query q = session.createQuery(("from Tag t join t.trucks tr where tr.id = " + (this.getId())));
    java.util.List l = q.list();
    session.close();
    for (java.lang.Object o : l) {
        this.addTags(((edu.temple.tutrucks.Tag) (o)));
    }
    return this.tags;
}