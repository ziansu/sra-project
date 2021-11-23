private void readTestFile() {
    java.io.Reader reader = null;
    try {
        reader = new java.io.FileReader("jsonTestFiles/order.json");
        controlpanel.Order order = gson.fromJson(reader, controlpanel.Order.class);
        this.printerQQ.addOrder(order);
    } catch (java.lang.Exception e) {
        java.lang.System.err.print("could not read the json file");
    }
    this.hasNextSteps = true;
}