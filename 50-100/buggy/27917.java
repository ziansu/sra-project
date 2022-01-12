public void loadGenderNames(java.util.HashSet<java.lang.String> genderSet, java.lang.String filePath) {
    java.util.List<java.lang.String> nameFileEntries = edu.stanford.nlp.io.IOUtils.linesFromFile(edu.stanford.nlp.pipeline.GenderAnnotator.MALE_FIRST_NAMES_PATH);
    for (java.lang.String nameCSV : nameFileEntries) {
        java.lang.String[] namesForThisLine = nameCSV.split(",");
        for (java.lang.String name : namesForThisLine) {
            genderSet.add(name.toLowerCase());
        }
    }
}