@org.junit.Test
public void testMissingProducer() {
    java.lang.String output = new java.lang.String(baos.toByteArray());
    junit.framework.Assert.assertTrue(output.contains("RESTEASY002120: ClassNotFoundException: "));
    junit.framework.Assert.assertTrue(output.contains("Unable to load builtin provider org.jboss.resteasy.Missing from "));
    junit.framework.Assert.assertTrue(output.contains("resteasy-jaxrs-testsuite/target/classes/META-INF/services/javax.ws.rs.ext.Providers"));
}