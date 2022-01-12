@java.lang.Override
@javax.transaction.Transactional
public void delete(com.tech.models.entities.Message message) {
    repository.delete(message);
}