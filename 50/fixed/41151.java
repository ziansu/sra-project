@com.oracle.truffle.api.dsl.Specialization
public final java.lang.Object doSAbstractObject(final java.lang.Object receiver) {
    som.VM.errorPrintln("BREAKPOINT");
    return receiver;
}