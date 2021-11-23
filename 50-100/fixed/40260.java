public void displayRow() {
    personData = javafx.collections.FXCollections.observableArrayList();
    org.hibernate.Session session = com.taylan.persistence.util.HibernateUtil.getSessionFactory().openSession();
    try {
        session.beginTransaction();
        java.util.List<com.taylan.persistence.DAO.Personaltrainers> ls = session.getNamedQuery("loadPersonalTrainers").list();
        for (com.taylan.persistence.DAO.Personaltrainers trainer : ls) {
            personData.add(trainer);
        }
    } catch (org.hibernate.HibernateException e) {
        e.printStackTrace();
    } finally {
        session.close();
    }
}