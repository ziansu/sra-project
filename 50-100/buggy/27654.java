protected java.lang.String joinAliasValue(java.lang.String alias, java.lang.String field) {
    alias = ((jpaProvider.getCollectionValueFunction()) != null) ? (((jpaProvider.getCollectionValueFunction()) + "(") + alias) + ")" : alias;
    if (field == null) {
        return alias;
    }
    return (alias + ".") + field;
}