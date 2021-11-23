public static org.catrobat.musicdroid.pocketmusic.note.symbol.SymbolContainer createSymbolsWithAccords() {
    org.catrobat.musicdroid.pocketmusic.note.symbol.SymbolContainer symbolContainer = org.catrobat.musicdroid.pocketmusic.test.note.symbol.SymbolContainerTestDataFactory.createSymbolContainer();
    symbolContainer.add(org.catrobat.musicdroid.pocketmusic.test.note.symbol.NoteSymbolTestDataFactory.createNoteSymbol(NoteLength.QUARTER, NoteName.C3, NoteName.C4));
    symbolContainer.add(org.catrobat.musicdroid.pocketmusic.test.note.symbol.NoteSymbolTestDataFactory.createNoteSymbol(NoteLength.QUARTER, NoteName.C3, NoteName.C4));
    symbolContainer.add(org.catrobat.musicdroid.pocketmusic.test.note.symbol.NoteSymbolTestDataFactory.createNoteSymbol(NoteLength.QUARTER, NoteName.C3, NoteName.C4));
    return symbolContainer;
}