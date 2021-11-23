private org.neo4j.collection.primitive.PrimitiveLongIterator seek(java.lang.Object value) {
    return query(org.neo4j.kernel.api.impl.schema.LuceneDocumentStructure.newSeekQuery(value));
}