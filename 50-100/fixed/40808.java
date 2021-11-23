private java.util.List<java.lang.String> listReferenceProfiles(org.hl7.fhir.dstu3.model.ElementDefinition ed) {
    java.util.List<java.lang.String> res = new java.util.ArrayList<java.lang.String>();
    for (org.hl7.fhir.dstu3.model.ElementDefinition.TypeRefComponent tr : ed.getType()) {
        if ((((tr.getCode()) != null) && ("Reference".equals(tr.getCode()))) && ((tr.getProfile()) != null))
            res.add(tr.getProfile());
        
    }
    return res;
}