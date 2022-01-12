@java.lang.Override
protected org.objectweb.asm.Attribute read(org.objectweb.asm.ClassReader cr, int off, int len, char[] buf, int codeOff, org.objectweb.asm.Label[] labels) {
    final org.caesarj.runtime.mixer.ConstructorCallAttribute.ParameterPatternReader patternReader = new org.caesarj.runtime.mixer.ConstructorCallAttribute.ParameterPatternReader(cr, off, buf);
    return new org.caesarj.runtime.mixer.ConstructorCallAttribute(patternReader.readPattern(), ((cr.readByte(patternReader.getOffset())) != 0));
}