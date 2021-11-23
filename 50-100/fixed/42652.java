private void translate(wyjc.CodeBlock.Index index, wyjc.Codes.Update code, int freeSlot, java.util.ArrayList<wyjc.Bytecode> bytecodes) {
    bytecodes.add(new wyjc.Bytecode.Load(code.target(), convertType(code.type())));
    translateUpdate(code.iterator(), code, bytecodes);
    bytecodes.add(new wyjc.Bytecode.Store(code.target(), convertType(code.afterType)));
}