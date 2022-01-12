private void translate(wyjc.CodeBlock.Index index, wyjc.Codes.Convert c, int freeSlot, java.util.ArrayList<wyjc.Bytecode> bytecodes) {
    bytecodes.add(new wyjc.Bytecode.Load(c.operand(0), convertType(c.type())));
    addCoercion(c.type(), c.result, freeSlot, constants, bytecodes);
    bytecodes.add(new wyjc.Bytecode.Store(c.target(), convertType(c.result)));
}