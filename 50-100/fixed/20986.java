@org.testng.annotations.Test
public void typedErrorFor() {
    com.pipeclamp.constraints.string.StringLengthConstraint slc = new com.pipeclamp.constraints.string.StringLengthConstraint("", true, 5, 10);
    com.pipeclamp.api.Violation v = slc.errorFor(null);
    assertNull(v);
    v = slc.errorFor("billy");
    assertNull(v);
    v = slc.errorFor("bill");
    assertNotNull(v);
    v = slc.errorFor("bill bill bill bill");
    assertNotNull(v);
}