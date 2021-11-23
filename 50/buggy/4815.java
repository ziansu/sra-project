@java.lang.Override
public naga.core.spi.platform.client.teavm.TeaVmJsonObject set(java.lang.String key, boolean bool) {
    return setNativeElement(key, org.teavm.jso.core.JSBoolean.valueOf(bool));
}