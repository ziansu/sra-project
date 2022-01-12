@org.junit.Test
public void testGroupParameters() throws java.lang.Exception {
    us.kbase.narrativemethodstore.ValidationResults vr = us.kbase.narrativemethodstore.db.test.ValidatorTest.validate(1);
    junit.framework.Assert.assertEquals(("" + vr), 1L, ((long) (vr.getIsValid())));
}