public final nez.debugger.DebugVMInstruction opIchar(nez.debugger.Ichar inst) {
    if ((this.byteAt(this.pos)) == (inst.byteChar)) {
        this.consume(1);
        return inst.next;
    }
    this.result = false;
    return inst.jump;
}