@java.lang.Override
public com.health.entity.Hospital findById(int hid) {
    try {
        java.lang.String str = "FROM Hospital h WHERE h.hospital_id = ?1";
        javax.persistence.Query query = em.createQuery(str, com.health.entity.Hospital.class);
        query.setParameter(1, hid);
        com.health.entity.Hospital hospital = ((com.health.entity.Hospital) (query.getSingleResult()));
        return hospital;
    } catch (java.lang.Exception e) {
        em.close();
        e.printStackTrace();
        return null;
    }
}