@org.junit.Test
public final void GivenRightNumberIsZero_ResultShouldBeZero() throws com.sun.javaws.exceptions.InvalidArgumentException {
    Igor.GiveNumbers(0, 42);
    Igor.PerformCalculations();
    Igor.WriteFinalResult();
    org.junit.Assert.assertEquals("0", Igor.Notebook.Result());
}