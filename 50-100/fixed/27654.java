protected java.lang.String joinAliasValue(java.lang.String alias, java.lang.String field) {
    if (((jpaProvider.getCollectionValueFunction()) != null) && (field == null)) {
        alias = (((jpaProvider.getCollectionValueFunction()) + "(") + alias) + ")";
    }
    if (field == null) {
        return alias;
    }
    return (alias + ".") + field;
}