@java.lang.SuppressWarnings(value = "unchecked")
private java.util.Enumeration<com.konradjamrozik.botmate.controller.CommPortIdentifier> getPortIdentifiers() {
    com.konradjamrozik.botmate.controller.CommPortIdentifier.addPortName();
    return com.konradjamrozik.botmate.controller.CommPortIdentifier.getPortIdentifiers();
}