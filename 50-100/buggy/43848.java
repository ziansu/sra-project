public java.util.ArrayList<java.lang.String> getNumberDirsAndFiles() {
    elementsData.clear();
    elementsData.add((("Ukupan broj direktorija : " + (CompositeIterator.FileTreeIterator.numDir)) + 1));
    elementsData.add(("Ukupan broj datoteka : " + (CompositeIterator.FileTreeIterator.numFil)));
    CompositeIterator.FileTreeIterator.numDir = 0;
    CompositeIterator.FileTreeIterator.numFil = 0;
    return elementsData;
}