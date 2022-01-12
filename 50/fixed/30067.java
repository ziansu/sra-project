public final nez.debugger.DebugVMInstruction opIcharclass(nez.debugger.Icharclass inst) {
    int byteChar = this.byteAt(this.pos);
    if (inst.byteMap[byteChar]) {
        this.consume(1);
        return inst.next;
    }
    this.result = false;
    return inst.jump;
}