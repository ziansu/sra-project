private void printACDC(java.util.Vector<GraphDep> deps) throws java.io.IOException {
    java.io.File acdc = new java.io.File("output/acdcinput.rsf");
    java.io.FileWriter writer = new java.io.FileWriter(acdc);
    java.io.BufferedWriter w = new java.io.BufferedWriter(writer);
    for (int i = 0; i < (deps.size()); i++) {
        w.write((("depends " + (deps.get(i).getDependency())) + "\n"));
    }
    w.close();
}