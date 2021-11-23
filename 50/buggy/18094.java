@org.junit.Test
public void hashTestNoAuth() {
    org.apache.openmeetings.db.dto.basic.ServiceResult r = org.apache.openmeetings.webservice.TestUserService.getHash("aa");
    org.junit.Assert.assertEquals("OM Call should NOT be successful", r.getType(), Type.ERROR.name());
}