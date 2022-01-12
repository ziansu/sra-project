private boolean orderMatches(org.hl7.fhir.instance.model.BooleanType diff, org.hl7.fhir.instance.model.BooleanType base) {
    return ((diff == null) || (base == null)) || ((diff.getValue()) == (base.getValue()));
}