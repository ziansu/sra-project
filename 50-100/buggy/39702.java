private void readCSV(java.lang.String fileName) {
    java.io.FileInputStream fis = new java.io.FileInputStream(fileName);
    java.io.BufferedReader br = new java.io.BufferedReader(new java.io.InputStreamReader(fis, java.nio.charset.Charset.forName("UTF-8")));
    java.lang.String line;
    try {
        while ((line = br.readLine()) != null) {
            questionList.add(line);
        } 
    } catch (java.io.IOException e) {
        java.lang.System.out.println("IOException");
    } catch (java.io.FileNotFoundException e) {
        java.lang.System.out.println("File not found!");
    }
}