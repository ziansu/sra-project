private void translate(wyjc.CodeBlock.Index index, wyjc.Codes.Return c, int freeSlot, java.util.ArrayList<wyjc.Bytecode> bytecodes) {
    if ((c.type) == (Type.T_VOID)) {
        bytecodes.add(new wyjc.Bytecode.Return(null));
    }else {
        wyjc.JvmType jt = wyjc.Wyil2JavaBuilder.convertType(c.type);
        bytecodes.add(new wyjc.Bytecode.Load(c.operand, jt));
        bytecodes.add(new wyjc.Bytecode.Return(jt));
    }
}