@java.lang.Override
public void performLinking(de.mirkosertic.bytecoder.core.BytecodeLinkerContext aLinkerContext) {
    de.mirkosertic.bytecoder.core.BytecodeClassinfoConstant theConstant = getTypeConstant();
    aLinkerContext.linkClass(getObjectType());
    java.lang.String theClassName = theConstant.getConstant().stringValue();
    de.mirkosertic.bytecoder.core.BytecodeTypeRef[] theTypes = aLinkerContext.getSignatureParser().toTypes(theClassName);
    aLinkerContext.linkTypeRef(theTypes[0]);
}