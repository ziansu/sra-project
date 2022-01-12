public java.lang.Integer get(renderfarm.RayTracerRequest request) {
    if ((this.map.size()) == 0) {
        return null;
    }
    java.util.Map.Entry<java.lang.Integer, renderfarm.RequestCache.CachedValue> closer = this.map.ceilingEntry(calculateKey(request));
    if (closer == null) {
        closer = this.map.floorEntry(calculateKey(request));
    }
    return closer.getValue().getTime();
}