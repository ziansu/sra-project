public void parseListReader() {
    nhs.genetics.cardiff.framework.ListReader.log.log(java.util.logging.Level.INFO, "Parsing list");
    java.lang.String line;
    try (java.io.BufferedReader bReader = new java.io.BufferedReader(new java.io.FileReader(filePath))) {
        while ((line = bReader.readLine()) != null) {
            elements.add(line);
            uniqueElements.add(line);
        } 
        bReader.close();
    } catch (java.io.IOException e) {
        nhs.genetics.cardiff.framework.ListReader.log.log(java.util.logging.Level.SEVERE, ("Problem reading list: " + (e.getMessage())));
    }
}