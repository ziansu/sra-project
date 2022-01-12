@org.junit.Test
public void should_return_shorter_given_different_units() {
    oo.Length longer = new oo.Length(1, Unit.DM);
    oo.Length shorter = new oo.Length(9, Unit.CM);
    boolean result = shorter.isShorterThan(longer);
    org.junit.Assert.assertTrue(result);
}