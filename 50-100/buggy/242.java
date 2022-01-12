public void testGradientDescentIris() throws java.io.IOException {
    java.lang.System.out.println("Iris dataset");
    krzych.CsvData data = krzych.CsvData.readFile("src/test/resources/iris.csv");
    data.shuffle();
    data.printX();
    krzych.GradientDescent gd = new krzych.GradientDescent();
    krzych.Model model = gd.solve(data, 0.1, 1.0E-4);
    java.lang.Double errorCS = gd.validateControlSet(model);
    java.lang.Double errorTS = gd.validateTrainigSet(model);
    java.lang.System.out.println(("Error CS = " + errorCS));
    java.lang.System.out.println(("Error TS = " + errorTS));
}