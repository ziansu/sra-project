private void emitCitationWithoutSource(int level, org.gedcom4j.writer.AbstractCitation c) throws org.gedcom4j.writer.GedcomWriterException {
    org.gedcom4j.writer.CitationWithoutSource cws = ((org.gedcom4j.writer.CitationWithoutSource) (c));
    emitLinesOfText(level, "SOUR", cws.description);
    for (java.util.List<java.lang.String> linesOfText : cws.textFromSource) {
        emitLinesOfText((level + 1), "TEXT", linesOfText);
    }
    emitNotes((level + 1), cws.notes);
    emitCustomTags((level + 1), cws.customTags);
}