@org.junit.Test
public void testStaticFields() {
    org.junit.Assert.assertNotNull(ManagementUtil.jvm);
    org.junit.Assert.assertNotNull(ManagementUtil.getProcessIdMethod);
}