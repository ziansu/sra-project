@java.lang.Override
com.squareup.javapoet.CodeWriter emit(com.squareup.javapoet.CodeWriter out) throws java.io.IOException {
    rawType.emitAnnotations(out);
    rawType.emit(out);
    out.emitAndIndent("<");
    boolean firstParameter = true;
    for (com.squareup.javapoet.TypeName parameter : typeArguments) {
        if (!firstParameter)
            out.emitAndIndent(", ");
        
        parameter.emitAnnotations(out);
        parameter.emit(out);
        firstParameter = false;
    }
    return out.emitAndIndent(">");
}