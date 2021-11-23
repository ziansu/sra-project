@java.lang.Override
public double getDouble(java.lang.String key) {
    return naga.core.spi.platform.client.teavm.JSUtil.js2Double(getNativeElement(key));
}