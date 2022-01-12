@org.junit.Test
public final void GivenLeftNumberIsOne_ResultShouldBeRightNumber() throws com.sun.javaws.exceptions.InvalidArgumentException {
    Igor.GiveNumbers(1, 42);
    Igor.PerformCalculations();
    org.junit.Assert.assertEquals("42", Igor.Notebook.Result());
}