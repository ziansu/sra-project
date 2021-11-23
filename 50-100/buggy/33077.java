@java.lang.Override
public java.util.LinkedHashMap<java.lang.Integer, dataeaglealpha.Segment> getSegmentMap() {
    java.util.LinkedHashMap<java.lang.Integer, dataeaglealpha.Segment> newMap = new java.util.LinkedHashMap<>();
    java.util.Iterator it = segmentMap.keySet().iterator();
    while (it.hasNext()) {
        int tempKey = ((int) (it.next()));
        newMap.put(tempKey, ((dataeaglealpha.Segment) (segmentMap.get(tempKey))));
    } 
    return newMap;
}