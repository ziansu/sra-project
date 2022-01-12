@java.lang.Override
public nez.parser.vm.MozInst exec(nez.parser.vm.ParserMachineContext sc) throws nez.parser.TerminationException {
    if ((sc.prefetch()) == (this.byteChar)) {
        if (((nez.parser.vm.Moz86.BinaryMachine) && ((this.byteChar) == 0)) && (sc.eof())) {
            return this.next;
        }
        sc.move(1);
    }
    return this.next;
}