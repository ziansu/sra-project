@java.lang.Override
public boolean accepts(java.lang.String name) {
    return com.nuodb.migrator.utils.ObjectUtils.equals(identifier, com.nuodb.migrator.jdbc.metadata.filter.MetaDataNameEqualsFilter.valueOf(name));
}