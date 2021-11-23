public void doImport() {
    try {
        loadSections(null, mBookDirectory);
        mYiAnParser.adjust();
        mYiAnParser.validate();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}