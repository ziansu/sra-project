private void read(java.lang.String file_name) throws java.io.IOException {
    int lineno = 0;
    for (java.lang.String line : new joshua.decoder.ff.lm.LineReader(file_name, false)) {
        lineno++;
        java.lang.String[] lineComp = line.trim().split("\\s+");
        try {
            this.classMap.put(joshua.corpus.Vocabulary.id(lineComp[0]), java.lang.Integer.parseInt(lineComp[1]));
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            java.lang.System.err.println(java.lang.String.format("* WARNING: bad vocab line #%d '%s'", lineno, line));
        }
    }
}