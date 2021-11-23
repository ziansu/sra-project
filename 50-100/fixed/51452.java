private void translate(wyjc.CodeBlock.Index index, wyjc.Codes.Invert c, int freeSlot, java.util.ArrayList<wyjc.Bytecode> bytecodes) {
    wyjc.JvmType type = convertType(c.type());
    bytecodes.add(new wyjc.Bytecode.Load(c.operand(0), type));
    wyjc.JvmType.Function ftype = new wyjc.JvmType.Function(type);
    bytecodes.add(new wyjc.Bytecode.Invoke(wyjc.Wyil2JavaBuilder.WHILEYBYTE, "compliment", ftype, Bytecode.InvokeMode.VIRTUAL));
    bytecodes.add(new wyjc.Bytecode.Store(c.target(), type));
}