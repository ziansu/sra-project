public void writeNew(csc180final.webcrawler.moore.curtis.delgado.PersistedWord pW) throws java.io.IOException {
    file.seek(nextOffset);
    file.write(pW.serialize().getBytes());
    nextOffset += csc180final.webcrawler.moore.curtis.delgado.PersistedWord.getByteSize();
    updateNextOffset();
    int index = (((nextOffset) - 8) / (csc180final.webcrawler.moore.curtis.delgado.PersistedWord.getByteSize())) - 1;
    mapWord(pW, index);
}