@java.lang.Override
public void addDriver(java.lang.String parentUserName, model.UserProfile driver) {
    javax.persistence.EntityManager em = this.getMyWayEntityManager();
    em.merge(driver);
    em.getTransaction().begin();
    driver.setParent(parentUserName);
    em.merge(driver);
    em.getTransaction().commit();
}