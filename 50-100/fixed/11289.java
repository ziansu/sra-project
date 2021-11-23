@org.junit.Test
public void testGroupNotPresentInDisplay() throws java.lang.Exception {
    us.kbase.narrativemethodstore.ValidationResults vr = us.kbase.narrativemethodstore.db.test.ValidatorTest.validate(8, null);
    junit.framework.Assert.assertEquals(("" + vr), 0L, ((long) (vr.getIsValid())));
    junit.framework.Assert.assertEquals(("" + vr), 1, vr.getErrors().size());
    junit.framework.Assert.assertEquals(("" + vr), ("Can't find property [log_entries] within path " + "[parameter-groups] in display.yaml"), vr.getErrors().get(0));
}