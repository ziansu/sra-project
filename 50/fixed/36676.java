@org.junit.Test
public final void GivenLeftNumberIsZero_ResultShouldBeZero() throws com.sun.javaws.exceptions.InvalidArgumentException {
    Igor.GiveNumbers(42, 0);
    Igor.PerformCalculations();
    org.junit.Assert.assertEquals("0", Igor.Notebook.Result());
}