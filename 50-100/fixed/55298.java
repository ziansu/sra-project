private void closeDatabaseConnection() {
    try {
        if ((conn) != null)
            conn.close();
        
        if ((entityManager) != null) {
            entityManager.close();
        }
        if ((entityManagerFactory) != null) {
            entityManagerFactory.close();
        }
    } catch (java.lang.Exception e) {
        java.lang.System.err.println(e);
    }
}