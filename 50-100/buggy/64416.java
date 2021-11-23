public static java.util.stream.Stream<java.lang.String> parse(final java.lang.String line) {
    final int commentStartIdx = line.indexOf(se.kth.speech.nlp.SnowballPorter2EnglishStopwords.COMMENT_DELIM);
    java.lang.String content;
    if (commentStartIdx < 1) {
        content = line;
    }else {
        content = line.substring(0, commentStartIdx);
    }
    content = content.trim();
    return content.isEmpty() ? java.util.stream.Stream.empty() : java.util.stream.Stream.of(content);
}