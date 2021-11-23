private static java.util.ArrayList<java.lang.String> printFiles(java.util.ArrayList<java.lang.Integer> files, java.util.List<java.lang.String> fileNames) {
    java.util.ArrayList<java.lang.String> fileResults = new java.util.ArrayList<>();
    if (files != null) {
        for (java.lang.Integer file : files) {
            fileResults.add(fileNames.get(file));
        }
    }
    return fileResults;
}