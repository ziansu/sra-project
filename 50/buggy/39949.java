@java.lang.SuppressWarnings(value = "unchecked")
public java.util.List<com.example.picturecommunity.model.User> getUsers() {
    com.example.picturecommunity.controller.AdminModel.factory = javax.persistence.Persistence.createEntityManagerFactory(com.example.picturecommunity.controller.AdminModel.PERSISTENCE_UNIT_NAME);
    javax.persistence.EntityManager em = com.example.picturecommunity.controller.AdminModel.factory.createEntityManager();
    return ((java.util.List<com.example.picturecommunity.model.User>) (em.createQuery("SELECT u FROM User u ORDER BY u.username ASC").getResultList()));
}