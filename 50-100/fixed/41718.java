private void readCounter() {
    object.Item.setCounter(0);
    inputFile = new java.io.File(storage.FileHandler.COUNTER);
    try {
        java.io.BufferedReader reader = new java.io.BufferedReader(new java.io.FileReader(inputFile));
        int counter = java.lang.Integer.parseInt(reader.readLine());
        object.Item.setCounter(counter);
        reader.close();
    } catch (java.io.FileNotFoundException e) {
        writeCounter();
    } catch (java.io.IOException e) {
    }
}