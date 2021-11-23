public static void main(java.lang.String[] args) throws java.io.IOException {
    data.PERSTDatabase pdb = data.PERSTDatabase.getInstance();
    java.lang.System.out.println(("classification: " + ((int) (pdb.getDatabaseElement(120000).getClassification()))));
    pdb.closeDB();
}