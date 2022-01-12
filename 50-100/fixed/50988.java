@org.junit.Test
public void testCalMondayFirstWithMonthAndYear() throws sg.edu.nus.comp.cs4218.exception.CalException {
    java.lang.String[] args = "-m 6 1993".split(" ");
    java.lang.String expected = "     June 1993      \n" + ((((("Mo Tu We Th Fr Sa Su\n" + "   1  2  3  4  5  6 \n") + "7  8  9  10 11 12 13\n") + "14 15 16 17 18 19 20\n") + "21 22 23 24 25 26 27\n") + "28 29 30            ");
    sg.edu.nus.comp.cs4218.impl.app.CalApplicationTest.calApp.run(args, sg.edu.nus.comp.cs4218.impl.app.CalApplicationTest.is, sg.edu.nus.comp.cs4218.impl.app.CalApplicationTest.os);
    java.lang.String output = sg.edu.nus.comp.cs4218.impl.app.CalApplicationTest.os.toString();
    assertEquals(expected, output);
}