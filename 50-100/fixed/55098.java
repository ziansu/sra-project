@java.lang.Override
public java.lang.String interpretMeddraImpactTypeDesc(java.lang.String internalCode, java.lang.String impactType) {
    java.util.List<com.dbms.entity.cqt.RefConfigCodeList> codeList = findByConfigType(CqtConstants.CODE_LIST_TYPE_MEDDRA_DICT_IMPACT_TYPE, OrderBy.ASC);
    if (codeList != null) {
        for (com.dbms.entity.cqt.RefConfigCodeList c : codeList) {
            if ((c.getCodelistInternalValue().equals(internalCode)) && (c.getValue().startsWith((impactType + ":")))) {
                return c.getValue();
            }
        }
    }
    return "";
}