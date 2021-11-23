private void translate(wyjc.CodeBlock.Index index, wyjc.Codes.Convert c, int freeSlot, java.util.ArrayList<wyjc.Bytecode> bytecodes) {
    bytecodes.add(new wyjc.Bytecode.Load(c.operand(0), wyjc.Wyil2JavaBuilder.convertType(c.type())));
    addCoercion(c.type(), c.result, freeSlot, constants, bytecodes);
    bytecodes.add(new wyjc.Bytecode.Store(c.target(), wyjc.Wyil2JavaBuilder.convertType(c.result)));
}