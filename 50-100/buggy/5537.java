@java.lang.Override
public java.util.Map<java.lang.Integer, database.Persistable> getAll() {
    if ((!(deletedObjects.isEmpty())) || (mappedObjects.isEmpty())) {
        mappedObjects.clear();
        processLines().forEach(( p) -> mappedObjects.put(p.getId(), p));
        return mappedObjects;
    }else
        return mappedObjects;
    
}