@java.lang.Override
public java.lang.String stringValue(final msi.gama.runtime.IScope scope) throws msi.gama.runtime.exceptions.GamaRuntimeException {
    return (((((((("message[sender: " + (getData().getSender())) + "; receivers: ") + (getData().getReceivers())) + "; performative: ") + (getData().getPerformativeName())) + "; content: ") + (getData().getContent())) + "; content") + "]";
}