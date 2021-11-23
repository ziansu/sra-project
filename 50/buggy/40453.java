public void write(final org.jboss.jdeparser.SourceFileWriter writer) throws java.io.IOException {
    writeComments(writer);
    writer.write(FormatPreferences.Space.BEFORE_KEYWORD_ELSE);
    writer.write($KW.ELSE);
    super.write(writer, FormatPreferences.Space.BEFORE_BRACE_ELSE);
}