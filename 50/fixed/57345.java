public boolean schemeIdContainsAllOrNone(java.util.List<eu.europa.ec.fisheries.uvms.rules.service.business.fact.IdType> idTypes, java.lang.String... valuesToMatch) {
    return (!(schemeIdContainsAny(idTypes, valuesToMatch))) && (schemeIdContainsAll(idTypes, valuesToMatch));
}