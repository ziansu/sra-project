private boolean isType(org.hl7.fhir.dstu3.model.Base item, java.lang.String type) {
    if (type.equals(item.fhirType()))
        return true;
    
    return false;
}