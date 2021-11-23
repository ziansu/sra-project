private void translate(wyjc.CodeForest.Index index, wyjc.Codes.Loop c, int freeSlot, wyjc.CodeForest forest, java.util.ArrayList<wyjc.Bytecode> bytecodes) {
    java.lang.String loopHeader = freshLabel();
    bytecodes.add(new wyjc.Bytecode.Label(loopHeader));
    translate(new wyjc.CodeForest.Index(index.block(), 0), freeSlot, forest, bytecodes);
    bytecodes.add(new wyjc.Bytecode.Goto(loopHeader));
}