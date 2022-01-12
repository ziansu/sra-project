private java.lang.String getTypeColumnForSELECT(it.unibz.krdb.obda.owlrefplatform.core.sql.Term ht, java.util.List<java.lang.String> signature, int hpos, java.util.Set<java.lang.String> sqlVariableNames) {
    it.unibz.krdb.obda.model.Predicate.COL_TYPE type = getTypeColumn(ht);
    int code = type.getQuestCode();
    java.lang.String typeVariableName = sqladapter.nameTopVariable(signature.get(hpos), it.unibz.krdb.obda.owlrefplatform.core.sql.SQLGenerator.typeSuffix, sqlVariableNames);
    sqlVariableNames.add(typeVariableName);
    return java.lang.String.format(it.unibz.krdb.obda.owlrefplatform.core.sql.SQLGenerator.typeStrForSELECT, code, signature.get(hpos));
}