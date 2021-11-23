public static naga.core.spi.platform.client.teavm.TeaVmJsonObject create(org.teavm.jso.JSObject jso) {
    if ((jso == null) || (isUndefined(jso)))
        return null;
    
    return new naga.core.spi.platform.client.teavm.TeaVmJsonObject(jso);
}