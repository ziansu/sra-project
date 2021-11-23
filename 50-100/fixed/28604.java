public void write(java.lang.Object object) {
    java.lang.Integer id = null;
    try {
        org.hibernate.Session session = getSessionFactory().openSession();
        session.beginTransaction();
        session.save(object);
        session.getTransaction().commit();
        session.flush();
        session.close();
    } catch (java.lang.Exception e) {
        rbl.util.Log.add(DEBUG_TAG, "Could not write data");
        e.printStackTrace();
    }
}