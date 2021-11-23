@org.junit.Test
public void testCalSundayFirst() throws sg.edu.nus.comp.cs4218.exception.CalException {
    java.lang.String[] args = new java.lang.String[0];
    java.lang.String expected = "     March 2017     \n" + ((((("Su Mo Tu We Th Fr Sa\n" + "         1  2  3  4 \n") + "5  6  7  8  9  10 11\n") + "12 13 14 15 16 17 18\n") + "19 20 21 22 23 24 25\n") + "26 27 28 29 30 31   ");
    sg.edu.nus.comp.cs4218.impl.app.CalApplicationTest.calApp.run(args, sg.edu.nus.comp.cs4218.impl.app.CalApplicationTest.is, sg.edu.nus.comp.cs4218.impl.app.CalApplicationTest.os);
    java.lang.String output = sg.edu.nus.comp.cs4218.impl.app.CalApplicationTest.os.toString();
    assertEquals(expected, output);
}