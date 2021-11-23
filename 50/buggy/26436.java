@java.lang.Override
public br.ime.usp.aztec.WriterEncodingOutput getOutput() {
    return new br.ime.usp.aztec.WriterEncodingOutput(this.openOutputGivenIn(this.options));
}