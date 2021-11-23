@org.junit.Test
public void testEquals() {
    de.hdmstuttgart.zeitfresser.model.Record record1 = new de.hdmstuttgart.zeitfresser.model.Record();
    junit.framework.Assert.assertFalse(record1.equals(null));
    org.junit.Assert.assertTrue(record1.equals(record1));
    junit.framework.Assert.assertFalse(record1.equals(new java.lang.Object()));
    de.hdmstuttgart.zeitfresser.model.Record record2 = new de.hdmstuttgart.zeitfresser.model.Record();
    org.junit.Assert.assertTrue(record1.equals(record2));
    org.junit.Assert.assertTrue(record2.equals(record1));
}