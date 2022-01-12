@org.junit.Test
public void validatingOrgMRN2() {
    java.lang.String orgMrn = "urn:x-mrn:mcl:org:dma";
    boolean ret = net.maritimecloud.identityregistry.utils.MrnUtils.validateMrn(orgMrn);
    org.junit.Assert.assertFalse("Org MRN should be invalid", ret);
}