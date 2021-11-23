protected java.lang.Object readArray(org.nustaq.serialization.FSTClazzInfo.FSTFieldInfo referencee) throws java.lang.Exception {
    int pos = getCodec().getInputPos();
    java.lang.Object classOrArray = getCodec().readArrayHeader();
    if ((classOrArray instanceof java.lang.Class) == false)
        return classOrArray;
    
    if (classOrArray == null)
        return null;
    
    java.lang.Object o = readArrayNoHeader(referencee, pos, ((java.lang.Class) (classOrArray)));
    getCodec().readArrayEnd(null);
    return o;
}