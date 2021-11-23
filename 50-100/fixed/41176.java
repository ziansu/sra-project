private void translate(wyjc.CodeBlock.Index index, wyjc.Codes.Move c, int freeSlot, java.util.ArrayList<wyjc.Bytecode> bytecodes) {
    wyjc.JvmType jt = convertType(c.type());
    bytecodes.add(new wyjc.Bytecode.Load(c.operand(0), jt));
    bytecodes.add(new wyjc.Bytecode.Store(c.target(), jt));
}