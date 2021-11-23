private void persist(final net.krotscheck.kangaroo.database.entity.AbstractEntity e) {
    e.setCreatedDate(java.util.Calendar.getInstance(net.krotscheck.kangaroo.test.EnvironmentBuilder.UTC));
    e.setModifiedDate(java.util.Calendar.getInstance(net.krotscheck.kangaroo.test.EnvironmentBuilder.UTC));
    org.hibernate.Transaction t = session.beginTransaction();
    session.saveOrUpdate(e);
    t.commit();
    session.evict(e);
    if (!(trackedEntities.contains(e))) {
        trackedEntities.add(e);
    }
    session.flush();
}