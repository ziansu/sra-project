private void emitChangeDate(int level, org.gedcom4j.writer.ChangeDate cd) throws org.gedcom4j.writer.GedcomWriterException {
    if (cd != null) {
        emitTag(level, "CHAN");
        emitTagWithRequiredValue((level + 1), "DATE", cd.date);
        emitTagIfValueNotNull((level + 2), "TIME", cd.time);
        emitNotes((level + 1), cd.notes);
        emitCustomTags((level + 1), cd.customTags);
    }
}