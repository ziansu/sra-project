public void modifyLines(se.vandmo.textchecker.maven.utils.LineModifier modifier) {
    java.lang.StringBuilder result = new java.lang.StringBuilder();
    for (java.lang.String line : se.vandmo.textchecker.maven.Content.linePattern.split(data)) {
        result.append(modifier.modify(line)).append(java.lang.System.lineSeparator());
    }
    data = result.toString();
}