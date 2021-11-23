@java.lang.Override
public naga.core.spi.platform.client.teavm.TeaVmJsonObject set(java.lang.String key, double number) {
    return setNativeElement(key, org.teavm.jso.core.JSNumber.valueOf(number));
}