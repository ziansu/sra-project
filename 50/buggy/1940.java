public final nez.runtime.Instruction opIIsSymbol(nez.runtime.IIsSymbol op) {
    nez.runtime.ContextStack top = popLocalStack();
    if (this.matchSymbolTable(op.tableName, this.subbyte(top.pos, this.pos), op.checkLastSymbolOnly)) {
        return op.next;
    }
    return opIFail();
}