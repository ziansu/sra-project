public java.lang.Object readResolve() {
    if ((graphConfiguration) == null) {
        graphConfiguration = new java.util.ArrayList<>();
    }
    if (((getParserUniqueName()) == null) || ((getParserUniqueName()) == null)) {
        net.praqma.jenkins.memorymap.parser.AbstractMemoryMapParser.logger.log(java.util.logging.Level.FINE, "Entering 1.x compatibility block, assigning name: Default");
        setParserUniqueName("Default");
    }
    return this;
}