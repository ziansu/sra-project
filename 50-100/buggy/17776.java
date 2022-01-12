private gov.nist.healthcare.tools.hl7.v2.igamt.lite.service.serialization.impl.Table findTableInProfile(gov.nist.healthcare.tools.hl7.v2.igamt.lite.service.serialization.impl.ValueSetOrSingleCodeBinding valueSetOrSingleCodeBinding, gov.nist.healthcare.tools.hl7.v2.igamt.lite.service.serialization.impl.CompositeProfile compositeProfile) {
    for (java.lang.String currentId : compositeProfile.getTablesMap().keySet()) {
        if (currentId.equals(valueSetOrSingleCodeBinding.getId())) {
            return compositeProfile.getTablesMap().get(currentId);
        }
    }
    return null;
}