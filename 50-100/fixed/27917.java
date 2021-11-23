public void loadGenderNames(java.util.HashSet<java.lang.String> genderSet, java.lang.String filePath) {
    java.util.List<java.lang.String> nameFileEntries = edu.stanford.nlp.io.IOUtils.linesFromFile(filePath);
    for (java.lang.String nameCSV : nameFileEntries) {
        java.lang.String[] namesForThisLine = nameCSV.split(",");
        for (java.lang.String name : namesForThisLine) {
            genderSet.add(name.toLowerCase());
        }
    }
}