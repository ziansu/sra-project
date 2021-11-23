long delete(long id) {
    Record r = data.idMap.get(id);
    if (r != null) {
        removeFromDescriptionMap(r);
        data.idMap.remove(id);
        if ((r.size) > 7)
            removeFromSSMap(r);
        
        return r.sum;
    }
    return 0;
}