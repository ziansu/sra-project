protected void push8(java.lang.String[] args) {
    java.lang.String s = asmcup.compiler.Compiler.expectOne(args);
    if (asmcup.compiler.Compiler.isLiteral(s)) {
        pushLiteral8(s);
    }else
        if (s.startsWith("&")) {
            reference(asmcup.compiler.OP_PUSH, asmcup.compiler.MAGIC_PUSH_BYTE_IMMEDIATE, s);
        }else {
            reference(asmcup.compiler.OP_PUSH, asmcup.compiler.MAGIC_PUSH_BYTE_MEMORY, s);
        }
    
}