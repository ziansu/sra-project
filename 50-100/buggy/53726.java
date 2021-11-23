@org.junit.AfterClass
public static void afterClass() {
    java.lang.String clientId1 = java.lang.System.getProperty("org.orcid.web.testClient1.clientId");
    java.lang.String clientId2 = java.lang.System.getProperty("org.orcid.web.testClient2.clientId");
    java.lang.System.out.println((("clients after:" + clientId1) + clientId2));
    java.lang.System.out.println(((("after: " + (java.lang.System.getProperty("org.orcid.web.testUser1.username"))) + " ") + (java.lang.System.getProperty("org.orcid.web.testUser1.password"))));
    if (org.orcid.pojo.ajaxForm.PojoUtil.isEmpty(clientId2)) {
        revokeApplicationsAccess(clientId1);
    }else {
        revokeApplicationsAccess(clientId1, clientId2);
    }
}