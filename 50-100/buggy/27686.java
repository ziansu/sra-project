@java.lang.Override
public java.util.Map<java.lang.String, java.lang.Object> propertiesMap(org.harctoolbox.ircore.IrSignal.Pass state, org.harctoolbox.ircore.IrSignal.Pass pass, org.harctoolbox.irp.GeneralSpec generalSpec, org.harctoolbox.irp.NameEngine nameEngine) {
    java.util.Map<java.lang.String, java.lang.Object> map = super.propertiesMap(true, generalSpec, nameEngine);
    map.put("width", width.propertiesMap(true, generalSpec, nameEngine));
    map.put("reverse", reverse);
    return map;
}