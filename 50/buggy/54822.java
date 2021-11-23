public final nez.runtime.Instruction encodeIsSymbol(nez.lang.IsSymbol p, nez.runtime.Instruction next) {
    nez.runtime.Instruction inner = encodeExpression(p.getSymbolExpression(), new nez.runtime.IIsSymbol(p, p.checkLastSymbolOnly, next));
    return new nez.runtime.IPosPush(p, inner);
}