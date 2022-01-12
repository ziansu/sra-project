protected int addInterface(java.lang.String name) throws org.alljoyn.bus.AnnotationBusException {
    for (java.lang.Class<?> intf : proxy.getClass().getInterfaces()) {
        if (name.equals(org.alljoyn.bus.InterfaceDescription.getName(intf))) {
            org.alljoyn.bus.InterfaceDescription desc = new org.alljoyn.bus.InterfaceDescription();
            org.alljoyn.bus.Status status = desc.create(bus, intf);
            return status.getErrorCode();
        }
    }
    return Status.BUS_NO_SUCH_INTERFACE.getErrorCode();
}