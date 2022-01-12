@org.junit.Test
public void testDecideByFileNameAndModuleMatchingModuleNull() {
    final com.puppycrawl.tools.checkstyle.api.LocalizedMessage message = new com.puppycrawl.tools.checkstyle.api.LocalizedMessage(10, 10, "", "", null, "MyModule", getClass(), null);
    final com.puppycrawl.tools.checkstyle.api.AuditEvent ev = new com.puppycrawl.tools.checkstyle.api.AuditEvent(this, "ATest.java", message);
    org.junit.Assert.assertFalse(filter.accept(ev));
}