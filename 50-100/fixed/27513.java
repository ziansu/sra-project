private static void writeInteractionsToFile(java.util.List<com.zylman.protein.Interaction> interactions, java.util.Map<java.lang.String, com.zylman.protein.FeatureVector> proteins, java.lang.String fileName) throws java.io.IOException {
    java.io.BufferedWriter out = new java.io.BufferedWriter(new java.io.FileWriter(fileName));
    for (com.zylman.protein.Interaction interaction : interactions) {
        out.write(interaction.toString(proteins));
        out.write("\n");
    }
}