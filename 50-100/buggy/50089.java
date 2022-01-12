@javax.transaction.Transactional
@java.lang.Override
public sg.ncl.service.authentication.domain.Credentials updateStatus(@javax.validation.constraints.NotNull
final sg.ncl.service.authentication.domain.Credentials credentials) {
    sg.ncl.service.authentication.validation.Validator.checkStatus(credentials);
    final sg.ncl.service.authentication.data.jpa.CredentialsEntity entity = findCredentials(credentials);
    entity.setStatus(credentials.getStatus());
    final sg.ncl.service.authentication.data.jpa.CredentialsEntity saved = credentialsRepository.save(entity);
    log.info("Status updated: {}", saved);
    return saved;
}