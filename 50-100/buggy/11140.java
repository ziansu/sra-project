private co.paralleluniverse.fibers.instrument.CheckInstrumentationVisitor checkFileAndClose(java.io.InputStream is, java.lang.String name) {
    try {
        try {
            org.objectweb.asm.ClassReader r = new org.objectweb.asm.ClassReader(is);
            co.paralleluniverse.fibers.instrument.CheckInstrumentationVisitor civ = new co.paralleluniverse.fibers.instrument.CheckInstrumentationVisitor(this);
            r.accept(civ, (((org.objectweb.asm.ClassReader.SKIP_DEBUG) | (org.objectweb.asm.ClassReader.SKIP_FRAMES)) | (org.objectweb.asm.ClassReader.SKIP_CODE)));
            return civ;
        } finally {
            is.close();
        }
    } catch (co.paralleluniverse.fibers.instrument.UnableToInstrumentException ex) {
        throw ex;
    } catch (java.lang.Exception ex) {
        error(name, ex);
    }
    return null;
}