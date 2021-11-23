public boolean savePersonalInfo(me.shafin.sustord.model.PersonalInfo personalInfo) {
    org.hibernate.Session session = sessionFactory.openSession();
    try {
        session.beginTransaction();
        session.saveOrUpdate(personalInfo);
        session.getTransaction().commit();
    } catch (java.lang.Exception e) {
        return false;
    } finally {
        session.close();
    }
    return true;
}