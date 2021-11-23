@java.lang.Override
public void insertMessage(com.sbu.dao.model.MessageEntity message) {
    entityManager.persist(message);
    entityManager.getTransaction().commit();
}