@java.lang.Override
public void performLinking(de.mirkosertic.bytecoder.core.BytecodeLinkerContext aLinkerContext) {
    aLinkerContext.linkClass(getObjectType());
    de.mirkosertic.bytecoder.core.BytecodeClassinfoConstant theConstant = getTypeConstant();
    java.lang.String theClassName = theConstant.getConstant().stringValue();
    de.mirkosertic.bytecoder.core.BytecodeTypeRef[] theTypes = aLinkerContext.getSignatureParser().toTypes(theClassName);
    aLinkerContext.linkTypeRef(theTypes[0]);
}