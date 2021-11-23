public void readData(java.nio.file.Path path) {
    try {
        java.lang.String str = "C:\\GitHub\\Francis\\Francis\\src\\francis\\Daten\\" + path;
        java.io.BufferedReader reader = new java.io.BufferedReader(new java.io.FileReader(str));
        java.lang.String input = reader.readLine();
        reader.close();
        if (input.substring(((input.length()) - 4)).equals(".erp"))
            Utilities.JsonParser.addERPDataToOrder(input);
        
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}