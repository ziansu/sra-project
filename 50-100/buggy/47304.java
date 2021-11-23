public static void toSVG(java.lang.String graphName, per.PMap<?, ?>... m) throws java.io.IOException {
    per.Visualizer.toDot(graphName, new java.io.PrintWriter(new java.io.FileOutputStream((graphName + ".dot"))), m);
    per.Dot.dotToSvg(new java.io.FileInputStream("x.dot"), new java.io.FileOutputStream((graphName + ".svg")));
}