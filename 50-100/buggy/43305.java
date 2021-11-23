private java.util.Map<java.lang.String, com.jantuomi.tunkki.core.parser.datatype.CallableDatatype> getFunctionsFromCastModule() {
    java.util.Map<java.lang.String, com.jantuomi.tunkki.core.parser.datatype.CallableDatatype> map = new java.util.HashMap<>();
    builtins.put("as_int", new com.jantuomi.tunkki.core.runtime.builtins.globals.cast.AsIntBuiltinFunction().makeCallable());
    builtins.put("as_bool", new com.jantuomi.tunkki.core.runtime.builtins.globals.cast.AsBooleanBuiltinFunction().makeCallable());
    return map;
}