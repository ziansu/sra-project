private java.util.Map<java.lang.String, java.lang.Integer> getEnterLexemeTable(java.io.File exisitingLexemesFile) {
    java.util.Map<java.lang.String, java.lang.Integer> enterLexemes = new java.util.HashMap<>();
    try (java.util.Scanner scanner = new java.util.Scanner(exisitingLexemesFile)) {
        java.lang.Integer id = scanner.nextInt();
        java.lang.String alias = scanner.next();
        while (scanner.hasNext()) {
            enterLexemes.put(alias, id);
        } 
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
    return enterLexemes;
}