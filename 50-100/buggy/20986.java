@org.testng.annotations.Test
public void typedErrorFor() {
    com.pipeclamp.constraints.string.StringLengthConstraint slc = new com.pipeclamp.constraints.string.StringLengthConstraint("", true, 5, 10);
    com.pipeclamp.api.Violation v = slc.errorFor(null);
    org.testng.Assert.assertNull(v);
    v = slc.errorFor("billy");
    org.testng.Assert.assertNull(v);
    v = slc.errorFor("bill");
    org.testng.Assert.assertNotNull(v);
    v = slc.errorFor("bill bill bill bill");
    org.testng.Assert.assertNotNull(v);
}