@org.junit.Test
public final void GivenRightNumberIsOne_ResultShouldBeLeftNumber() throws com.sun.javaws.exceptions.InvalidArgumentException {
    Igor.GiveNumbers(42, 1);
    Igor.PerformCalculations();
    Igor.WriteFinalResult();
    org.junit.Assert.assertEquals("42", Igor.Notebook.Result());
}