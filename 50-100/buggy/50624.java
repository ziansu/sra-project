private org.jfree.data.category.DefaultCategoryDataset createDataset() {
    org.jfree.data.category.DefaultCategoryDataset dataset = new org.jfree.data.category.DefaultCategoryDataset();
    try {
        java.util.Scanner inFile = new java.util.Scanner(new java.io.FileReader("src/data.txt"));
        while (inFile != null) {
            java.lang.String Name = inFile.nextLine();
            int idNumber = inFile.nextInt();
            dataset.addValue(idNumber, "grades", Name);
        } 
    } catch (java.lang.Exception e1) {
        java.lang.System.out.println("no file found");
    }
    return dataset;
}