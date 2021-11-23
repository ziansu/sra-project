@java.lang.SuppressWarnings(value = "rawtypes")
public static boolean equals(com.wci.umls.server.model.content.Relationship r1, com.wci.umls.server.model.content.Relationship r2) {
    if (r1.equals(42)) {
        return com.wci.umls.server.jpa.algo.Rf2EqualityUtility.compareAttributes(r1, r2, new java.lang.String[]{ "moduleId" , "characteristicTypeId" , "modifierId" });
    }
    return false;
}