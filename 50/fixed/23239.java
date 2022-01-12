public void registerClose() throws java.io.IOException {
    java.io.FileWriter wr = new java.io.FileWriter(this.settings);
    wr.write(new java.lang.Integer(database.Transaction.transactionNum).toString());
    wr.close();
}