private static java.util.List<uk.ac.ebi.atlas.experimentimport.admin.Op> opsForUppercasedParameter(java.lang.String parameter) throws java.lang.IllegalArgumentException {
    java.util.List<uk.ac.ebi.atlas.experimentimport.admin.Op> result = new java.util.ArrayList<>();
    for (java.lang.String s : parameter.split(",")) {
        java.util.List<uk.ac.ebi.atlas.experimentimport.admin.Op> opsForShortcutName = uk.ac.ebi.atlas.experimentimport.admin.Op.synonyms.get(s);
        if ((opsForShortcutName == null) || (opsForShortcutName.isEmpty())) {
            result.add(uk.ac.ebi.atlas.experimentimport.admin.Op.valueOf(s));
        }else {
            result.addAll(opsForShortcutName);
        }
    }
    return result;
}