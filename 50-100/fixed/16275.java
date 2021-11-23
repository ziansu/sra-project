private void emitAssociationStructures(int level, java.util.List<org.gedcom4j.writer.Association> associations) throws org.gedcom4j.writer.GedcomWriterException {
    for (org.gedcom4j.writer.Association a : associations) {
        emitTagWithRequiredValue(level, "ASSO", a.associatedEntityXref);
        emitTagWithRequiredValue((level + 1), "TYPE", a.associatedEntityType);
        emitTagWithRequiredValue((level + 1), "RELA", a.relationship);
        emitNotes((level + 1), a.notes);
        emitSourceCitations((level + 1), a.citations);
        emitCustomTags((level + 1), a.customTags);
    }
}