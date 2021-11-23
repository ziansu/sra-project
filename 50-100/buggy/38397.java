private void propulateRourke(org.oscarehr.util.LoggedInInfo loggedInInfo, ca.bornontario.x18MEWBV.RBR rourke, java.lang.Integer fdid) {
    ca.bornontario.x18MEWBV.RBRM18 rbrm18 = rourke.addNewRBRM18();
    propulateRourkeFromRourke18m(rbrm18, fdid);
    propulateRourkeFromNDDS(rbrm18);
    propulateRourkeFromImmunization(loggedInInfo, rourke);
    rourke.setLastUpdateDate(formDateTimeToCal(fdid));
    rourke.setSetID(fdid);
    rourke.setVersionID(fdid);
}