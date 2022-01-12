public static int totalLogin(java.lang.String filename, int weeks) throws java.io.IOException {
    com.opencsv.CSVReader in = new com.opencsv.CSVReader(new java.io.FileReader(filename));
    int count = 0;
    java.lang.String[] col;
    in.readNext();
    while ((col = in.readNext()) != null)
        count += (col[5].contains("LOGIN")) ? 1 : 0;
    
    in.close();
    return count;
}