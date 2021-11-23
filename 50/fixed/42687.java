@java.lang.Override
public naga.core.spi.platform.client.teavm.TeaVmJsonObject set(java.lang.String key, double value) {
    return setNativeElement(key, org.teavm.jso.core.JSNumber.valueOf(value));
}