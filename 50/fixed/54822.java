public final nez.runtime.Instruction encodeIsSymbol(nez.lang.IsSymbol p, nez.runtime.Instruction next) {
    return new nez.runtime.IIsSymbol(p, true, next);
}