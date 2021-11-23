public void writeToFile() throws java.io.IOException {
    currentCollection = modelCol.getCollection();
    skrivFil1 = new java.io.FileWriter(selectedCollection, true);
    java.io.BufferedWriter writer = new java.io.BufferedWriter(skrivFil1);
    java.io.PrintWriter printer = new java.io.PrintWriter(writer);
    for (Item i : currentCollection) {
        java.lang.String s = i.toString();
        printer.println(s);
    }
    if (currentCollection.isEmpty()) {
        skrivFil1 = new java.io.FileWriter(selectedCollection);
    }
    printer.close();
}