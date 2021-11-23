@javax.ejb.TransactionAttribute(value = javax.ejb.TransactionAttributeType.REQUIRES_NEW)
public void saveNetworkEntityArray(com.ait.db.model.NetworkEntity[] networkEntity) {
    for (int i = 0; i < (networkEntity.length); i++) {
        entityManager.persist(networkEntity[i]);
    }
    java.lang.System.out.println("DONE");
}