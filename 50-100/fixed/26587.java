public static com.enonic.xp.query.filter.Filter create(final com.enonic.xp.security.PrincipalKeys principalsKeys) {
    if (com.enonic.xp.repo.impl.elasticsearch.query.translator.factory.AclFilterBuilderFactory.isSuperUser(principalsKeys)) {
        return null;
    }
    if (principalsKeys.isEmpty()) {
        return com.enonic.xp.repo.impl.elasticsearch.query.translator.factory.AclFilterBuilderFactory.createNoPrincipalsFilter();
    }
    final com.enonic.xp.query.filter.ValueFilter.Builder valueFilterBuilder = com.enonic.xp.query.filter.ValueFilter.create().fieldName(NodeIndexPath.PERMISSIONS_READ.toString());
    for (final com.enonic.xp.security.PrincipalKey principalKey : principalsKeys) {
        valueFilterBuilder.addValue(com.enonic.xp.data.ValueFactory.newString(principalKey.toString()));
    }
    return valueFilterBuilder.build();
}