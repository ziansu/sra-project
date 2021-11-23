private void printBUNCH(java.util.Vector<GraphDep> dep) throws java.io.IOException {
    java.io.File bunch = new java.io.File("output/bunchinput");
    java.io.FileWriter writer = new java.io.FileWriter(bunch);
    java.io.BufferedWriter w = new java.io.BufferedWriter(writer);
    for (int i = 0; i < ((dep.size()) - 1); i++) {
        w.write(((dep.get(i).getDependency()) + "\n"));
    }
    w.close();
}