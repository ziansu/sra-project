public void saveXmlStringToFile() {
    try {
        java.io.FileWriter fileWriter = new java.io.FileWriter("ContactsBook.xml", false);
        try {
            fileWriter.write(this.convertToXmlString());
            fileWriter.flush();
        } finally {
            fileWriter.close();
        }
    } catch (java.io.IOException e) {
        java.lang.System.out.println(e.getMessage());
    }
}