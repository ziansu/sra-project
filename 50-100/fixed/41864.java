private void assertAttributes(com.evolveum.midpoint.xml.ns._public.common.common_3.ShadowType shadow, java.lang.String uid, java.lang.String givenName, java.lang.String sn, java.lang.String cn) {
    com.evolveum.midpoint.test.IntegrationTestTools.assertAttribute(shadow, com.evolveum.midpoint.testing.consistency.ConsistencyTest.resourceTypeOpenDjrepo, "uid", uid);
    if (givenName != null) {
        com.evolveum.midpoint.test.IntegrationTestTools.assertAttribute(shadow, com.evolveum.midpoint.testing.consistency.ConsistencyTest.resourceTypeOpenDjrepo, "givenName", givenName);
    }
    if (sn != null) {
        com.evolveum.midpoint.test.IntegrationTestTools.assertAttribute(shadow, com.evolveum.midpoint.testing.consistency.ConsistencyTest.resourceTypeOpenDjrepo, "sn", sn);
    }
    com.evolveum.midpoint.test.IntegrationTestTools.assertAttribute(shadow, com.evolveum.midpoint.testing.consistency.ConsistencyTest.resourceTypeOpenDjrepo, "cn", cn);
}