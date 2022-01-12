public renderfarm.RequestCache.CachedValue get(renderfarm.RayTracerRequest request) {
    if ((this.map.size()) == 0) {
        return null;
    }
    renderfarm.Map.Entry<java.lang.Integer, renderfarm.RequestCache.CachedValue> closer = this.map.ceilingEntry(calculateKey(request));
    if (closer == null) {
        closer = this.map.floorEntry(calculateKey(request));
    }
    return closer.getValue();
}