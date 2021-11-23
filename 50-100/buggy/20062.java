public static java.lang.String getTypeName(org.osate.aadl2.NamedElement finalId, java.util.Map<org.osate.aadl2.NamedElement, java.lang.String> typeMap, java.util.Set<jkind.lustre.Type> typeExpressions) {
    if (finalId == null) {
        return null;
    }
    if (typeMap.containsKey(finalId)) {
        return typeMap.get(finalId);
    }
    com.rockwellcollins.atc.agree.analysis.AgreeTypeUtils.recordType(finalId, typeMap, typeExpressions);
    return typeMap.get(finalId);
}