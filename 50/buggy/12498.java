@java.lang.Override
public com.pratilipi.data.transfer.Language getLanguage(java.lang.Long id) {
    return getEntity(com.pratilipi.data.access.gae.LanguageEntity.class, id);
}