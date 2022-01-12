@org.junit.Test
public void testMissingProducer() {
    junit.framework.Assert.assertTrue(new java.lang.String(baos.toByteArray()).contains("RESTEASY002120: ClassNotFoundException: "));
    junit.framework.Assert.assertTrue(new java.lang.String(baos.toByteArray()).contains("Unable to load builtin provider org.jboss.resteasy.Missing from "));
    junit.framework.Assert.assertTrue(new java.lang.String(baos.toByteArray()).contains("resteasy-jaxrs-testsuite/target/classes/META-INF/services/javax.ws.rs.ext.Providers"));
}