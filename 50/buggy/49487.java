public Uniplay.Kernel.NGGameEngineMemoryCell getCell(int aIndex) {
    if ((0 < aIndex) && (aIndex < (FCells.size()))) {
        return FCells.get(aIndex);
    }
    return null;
}