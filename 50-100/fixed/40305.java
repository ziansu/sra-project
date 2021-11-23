@java.lang.Override
public edu.hm.shareit.resources.unsecured.media.MediaServiceResult addRecord(edu.hm.shareit.models.mediums.Medium medium) {
    edu.hm.shareit.resources.unsecured.media.MediaServiceResult result = edu.hm.shareit.resources.unsecured.media.MediaServiceResult.FAILURE;
    org.hibernate.Session session = openOrGetCurrentSession();
    if (notNull(session)) {
        org.hibernate.Transaction transaction = session.beginTransaction();
        session.save(medium);
        java.lang.System.out.println(medium.toString());
        transaction.commit();
        result = edu.hm.shareit.resources.unsecured.media.MediaServiceResult.SUCCESS;
    }
    return result;
}