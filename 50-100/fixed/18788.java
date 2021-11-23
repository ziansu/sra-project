long delete(long id) {
    Record r = data.idMap.get(id);
    if (r != null) {
        removeFromDescriptionMap(r);
        data.idMap.remove(id);
        removeFromSSMap(r);
        return r.sum;
    }
    return 0;
}