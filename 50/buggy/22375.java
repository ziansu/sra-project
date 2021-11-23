public static void registerComponent(com.unideb.bosch.automatedcar.framework.ISystemComponent comp) {
    com.unideb.bosch.automatedcar.framework.VirtualFunctionBus.components.add(comp);
    java.lang.System.out.println((("System component " + (comp.toString())) + " is registered on the virtual function bus"));
}