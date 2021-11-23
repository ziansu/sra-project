public void findReferencedMachines() throws de.be4.classicalb.core.parser.exceptions.BException {
    java.lang.String fileName;
    try {
        fileName = mainFile.getCanonicalPath();
    } catch (java.io.IOException e) {
        throw new de.be4.classicalb.core.parser.exceptions.BException(mainFile.getAbsolutePath(), e);
    }
    try {
        this.start.apply(this);
    } catch (de.be4.classicalb.core.parser.exceptions.VisitorException e) {
        logException(e);
        throw new de.be4.classicalb.core.parser.exceptions.BException(fileName, e.getException());
    }
}