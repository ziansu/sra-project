public boolean savePersonalInfo(me.shafin.sustord.model.PersonalInfo personalInfo) {
    try {
        org.hibernate.Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.saveOrUpdate(personalInfo);
        session.getTransaction().commit();
        session.close();
    } catch (java.lang.Exception e) {
        return false;
    }
    return true;
}