@java.lang.Override
public naga.core.spi.platform.client.teavm.TeaVmJsonObject set(java.lang.String key, boolean value) {
    return setNativeElement(key, org.teavm.jso.core.JSBoolean.valueOf(value));
}