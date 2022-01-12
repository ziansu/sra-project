@java.lang.Override
@org.springframework.cache.annotation.Cacheable(value = "identifier-types")
public org.orcid.pojo.IdentifierType fetchIdentifierTypeByDatabaseName(java.lang.String name, java.util.Locale loc) {
    loc = (loc == null) ? java.util.Locale.ENGLISH : loc;
    org.orcid.persistence.jpa.entities.IdentifierTypeEntity entity = idTypeDao.getEntityByName(name);
    org.orcid.pojo.IdentifierType type = adapter.fromEntity(entity);
    type.setDescription(getMessage(type.getName(), loc));
    return type;
}