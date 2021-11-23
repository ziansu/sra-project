public static void main(java.lang.String[] args) throws java.io.IOException {
    data.PERSTDatabase pdb = data.PERSTDatabase.getInstance();
    io.PERST_MNIST_Converter conv = new io.PERST_MNIST_Converter("writeLabelPath", "writeImagePath");
    java.lang.System.out.println(("database elements: " + (pdb.getNumberOfDatabaseElements_())));
    java.lang.System.out.println(("classification: " + ((int) (pdb.getDatabaseElement(120000).getClassification()))));
    pdb.closeDB();
}