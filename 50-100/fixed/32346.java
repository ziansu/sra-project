public void testAnalyze() throws java.io.IOException, java.lang.ClassNotFoundException {
    java.lang.System.out.println("analyze");
    aptgraph.server.RequestHandler handler = new aptgraph.server.RequestHandler(java.nio.file.Paths.get("src/test/resources/dummyDir"));
    handler.getUsers();
    handler.analyze("253.115.106.54", new double[]{ 0.7 , 0.1 , 0.2 }, new double[]{ 0.8 , 0.2 }, 0.0, 0.0, true, true, true, "", new double[]{ 0.45 , 0.45 , 0.1 }, true);
}