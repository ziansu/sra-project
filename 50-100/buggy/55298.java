private void closeDatabaseConnection() {
    try {
        entityManager.getTransaction().commit();
        entityManager.flush();
        entityManager.close();
        entityManagerFactory.close();
        if ((conn) != null)
            conn.close();
        
    } catch (java.lang.Exception e) {
    }
}