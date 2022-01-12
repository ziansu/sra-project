private static java.lang.String resolveJsonUnitAliases(java.lang.String body) {
    while (body.contains(com.sberbank.pfm.test.concordion.extensions.exam.PlaceholdersResolver.PREFIX_JSON_UNIT_ALIAS)) {
        java.lang.String original = body;
        java.lang.String alias = com.sberbank.pfm.test.concordion.extensions.exam.PlaceholdersResolver.extractFromAlias(original);
        body = original.replace((((com.sberbank.pfm.test.concordion.extensions.exam.PlaceholdersResolver.PREFIX_JSON_UNIT_ALIAS) + alias) + (com.sberbank.pfm.test.concordion.extensions.exam.PlaceholdersResolver.POSTFIX)), com.sberbank.pfm.test.concordion.extensions.exam.PlaceholdersResolver.toJsonUnit(alias));
    } 
    return body;
}