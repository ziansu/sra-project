@java.lang.Override
@javax.transaction.Transactional
public void removeFromDb(org.altar.upacademy.model.Platform platform) {
    org.altar.upacademy.model.Platform platformToRemove = getDb().find(org.altar.upacademy.model.Platform.class, platform.getId());
    getDb().remove(platformToRemove);
}