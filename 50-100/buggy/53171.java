private nez.peg.tpeg.type.LType registerType(java.lang.String mangledName, nez.peg.tpeg.type.LType type) throws nez.peg.tpeg.type.TypeException {
    if ((this.typeMap.put(mangledName, type)) == null) {
        nez.peg.tpeg.type.TypeException.typeError(("already defined type: " + (type.getSimpleName())));
    }
    return type;
}