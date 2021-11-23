public logic.Paragraph parseParagraph(java.lang.String input) {
    logic.Paragraph paragraph = new logic.Paragraph();
    java.util.regex.Pattern pattern = java.util.regex.Pattern.compile(sentence);
    java.util.regex.Matcher matcher = pattern.matcher(input);
    while (matcher.find()) {
        paragraph.add(parseSentence(matcher.group()));
    } 
    return paragraph;
}