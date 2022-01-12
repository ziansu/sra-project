@javax.transaction.Transactional
@java.lang.Override
public sg.ncl.service.authentication.domain.Credentials removeRoles(@javax.validation.constraints.NotNull
final java.lang.String id, @javax.validation.constraints.NotNull
final sg.ncl.service.authentication.domain.Credentials credentials) {
    sg.ncl.service.authentication.validation.Validator.checkRoles(credentials);
    final sg.ncl.service.authentication.data.jpa.CredentialsEntity entity = findCredentials(id);
    credentials.getRoles().forEach(entity::removeRole);
    final sg.ncl.service.authentication.data.jpa.CredentialsEntity saved = credentialsRepository.save(entity);
    log.info("Roles removed: {}", saved);
    return saved;
}