public final nez.runtime.Instruction opIIsSymbol(nez.runtime.IIsSymbol op) {
    if (this.matchSymbolTable(op.tableName, op.checkLastSymbolOnly)) {
        return op.next;
    }
    return opIFail();
}