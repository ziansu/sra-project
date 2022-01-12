@java.lang.Override
public org.neo4j.cursor.Cursor<org.neo4j.storageengine.api.RelationshipItem> relationshipCursorGetAll() {
    statement.assertOpen();
    java.util.ArrayList<java.lang.Long> list = new java.util.ArrayList<>();
    org.neo4j.collection.primitive.PrimitiveLongIterator it = relationshipsGetAll();
    while (it.hasNext()) {
        long l = it.next();
        list.add(l);
    } 
    long[] array = org.apache.commons.lang3.ArrayUtils.toPrimitive(((java.lang.Long[]) (list.toArray())));
    org.neo4j.kernel.impl.util.Cursors.cursor();
    return super.relationshipCursorGetAll();
}