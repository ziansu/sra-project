public void enableItem(int id) {
    entityManager.getTransaction().begin();
    javax.persistence.Query query = entityManager.createQuery((("update MenuItem m set m.isEnabled=1 where m.menuId=" + id) + ""));
    query.executeUpdate();
    entityManager.getTransaction().commit();
    entityManager.close();
    entityManagerFactory.close();
}