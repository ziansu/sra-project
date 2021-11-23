private void propulateRourke(org.oscarehr.integration.born.RBR rourke, java.lang.Integer fdid) {
    org.oscarehr.integration.born.RBRM18 rbrm18 = rourke.addNewRBRM18();
    propulateRourkeFromRourke18m(rbrm18, fdid);
    propulateRourkeFromNDDS(rbrm18);
    propulateRourkeFromImmunization(rourke);
    rourke.setLastUpdateDate(formDateTimeToCal(fdid));
    rourke.setSetID(fdid);
    rourke.setVersionID(1);
}