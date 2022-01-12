@java.lang.Override
protected void onCreate(com.protalk.serial.Serial _serial) {
    super.onCreate(_serial);
    add(com.protalk.broker.resources.ControlableResource.getFactory().create(ControlableResource.TYPE_WINDOW, _serial));
    add(com.protalk.broker.resources.ReadonlyResource.getFactory().create(ReadonlyResource.TYPE_PPM, _serial));
}