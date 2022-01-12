@javax.transaction.Transactional
@java.lang.Override
public sg.ncl.service.authentication.domain.Credentials updatePassword(@javax.validation.constraints.NotNull
final sg.ncl.service.authentication.domain.Credentials credentials) {
    sg.ncl.service.authentication.validation.Validator.checkPassword(credentials);
    final sg.ncl.service.authentication.data.jpa.CredentialsEntity entity = findCredentials(credentials);
    hashPassword(entity, credentials.getPassword());
    changePassword(credentials.getId(), credentials.getPassword());
    final sg.ncl.service.authentication.data.jpa.CredentialsEntity saved = credentialsRepository.save(entity);
    log.info("Password updated: {}", saved);
    return saved;
}