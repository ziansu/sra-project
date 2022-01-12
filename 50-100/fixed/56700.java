public void remove(pcgen.cdom.enumeration.CharID id, S obj) {
    java.util.Map<S, A> map = getCachedMap(id);
    if (map != null) {
        A old = map.remove(obj);
        if (old != null) {
            fireScopeFacetChangeEvent(id, obj, old, DataFacetChangeEvent.DATA_REMOVED);
        }
    }
}