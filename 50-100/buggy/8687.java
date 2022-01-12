private void lineLengthCalculator(java.lang.String currentLine) {
    (totalLines)++;
    java.lang.String[] str1 = currentLine.replaceAll("\\s+", " ").replaceAll("\\W", "").split(" ");
    for (java.lang.String s : str1) {
        lineLengthList.add(s.length());
        totalCharacters += s.length();
    }
}