public static void cyclic() {
    for (com.unideb.bosch.automatedcar.framework.ISystemComponent comp : com.unideb.bosch.automatedcar.framework.VirtualFunctionBus.components) {
        comp.cyclic();
    }
}