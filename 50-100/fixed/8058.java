@java.lang.Override
public nez.parser.vm.MozInst exec(nez.parser.vm.ParserMachineContext sc) throws nez.parser.TerminationException {
    if ((sc.prefetch()) == (this.byteChar)) {
        if ((this.byteChar) == 0) {
            return this.next;
        }
        sc.move(1);
    }
    return this.next;
}