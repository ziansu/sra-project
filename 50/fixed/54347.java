public final nez.debugger.DebugVMInstruction opIany(nez.debugger.Iany inst) {
    if (hasUnconsumed()) {
        this.consume(1);
        return inst.next;
    }
    this.result = false;
    return inst.jump;
}