@java.lang.Override
public void removerPorId(java.lang.Object id) {
    javax.persistence.Query query = getEntityManager().createQuery("delete Transacao where id = :id");
    query.setParameter("id", id);
    query.executeUpdate();
}