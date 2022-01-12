private void translateIfGoto(wyjc.CodeBlock.Index index, wyjc.Codes.If code, int freeSlot, java.util.ArrayList<wyjc.Bytecode> bytecodes) {
    wyjc.JvmType jt = convertType(code.type);
    bytecodes.add(new wyjc.Bytecode.Load(code.leftOperand, jt));
    bytecodes.add(new wyjc.Bytecode.Load(code.rightOperand, jt));
    translateIfGoto(index, code.type, code.op, code.target, freeSlot, bytecodes);
}