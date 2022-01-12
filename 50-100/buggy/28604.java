public boolean write(java.lang.Object object) {
    try {
        org.hibernate.Session session = getSessionFactory().openSession();
        session.beginTransaction();
        session.save(object);
        session.getTransaction().commit();
        session.flush();
        session.close();
        return true;
    } catch (java.lang.Exception e) {
        rbl.util.Log.add(DEBUG_TAG, "Could not write data");
        e.printStackTrace();
        return false;
    }
}