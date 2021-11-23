public static com.arangodb.entity.CollectionType valueOf(int type) {
    com.arangodb.entity.CollectionType result = null;
    if (type == 2) {
        result = com.arangodb.entity.CollectionType.DOCUMENT;
    }else
        if (type == 3) {
            result = com.arangodb.entity.CollectionType.EDGE;
        }
    
    return result;
}