public void readData(java.nio.file.Path path) {
    try {
        java.lang.String str = "C:\\GitHub\\Francis\\Francis\\src\\francis\\Daten\\" + path;
        if (str.substring(((str.length()) - 4)).equals(".erp")) {
            java.io.BufferedReader reader = new java.io.BufferedReader(new java.io.FileReader(str));
            java.lang.String input = reader.readLine();
            reader.close();
            Utilities.JsonParser.addERPDataToOrder(input);
        }
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}