public void writeRaw(final java.lang.String content, co.uk.epicguru.IO.parsers.JLineParser<?> parser, java.lang.String key) {
    java.lang.String newString = co.uk.epicguru.IO.JLineIO.translateIn(content.trim());
    appendToLine((((getStart(parser, key)) + (newString.trim())) + (getEnd(parser, key))));
    (writes)++;
}