@java.lang.Override
public java.util.LinkedHashMap<java.lang.Integer, dataeaglealpha.Segment> getSegmentMap() {
    java.util.LinkedHashMap<java.lang.Integer, dataeaglealpha.Segment> newMap = new java.util.LinkedHashMap<>();
    for (int tempKey : segmentMap.keySet()) {
        newMap.put(tempKey, ((dataeaglealpha.Segment) (segmentMap.get(tempKey))));
    }
    return newMap;
}