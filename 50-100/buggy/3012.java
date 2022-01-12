public org.msgpack.value.Value visit(java.lang.String rootPath, org.msgpack.value.Value value) {
    if (!(shouldVisit(rootPath))) {
        return value;
    }
    if (value.isArrayValue()) {
        return visitArray(rootPath, value.asArrayValue());
    }else
        if (value.isMapValue()) {
            return visitMap(rootPath, value.asMapValue());
        }else {
            return value;
        }
    
}