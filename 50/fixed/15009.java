public java.lang.String codeCRC32(invar.TypeStruct type) {
    type.codecRule();
    return java.lang.Long.toHexString(type.getCodecRuleCRC32()).toUpperCase();
}