public void createNewEntry(java.lang.String lexeme, parser.EntryBuilder tableEntry) {
    symbolTable.TableEntry entry = new symbolTable.TableEntry(lexeme.toLowerCase(), nextoffset, tableEntry);
    tableEntry.setNest(nestingLevel);
    hm.put(lexeme, entry);
    (nextoffset)++;
}