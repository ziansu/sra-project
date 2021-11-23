private org.neo4j.collection.primitive.PrimitiveLongIterator seek(java.lang.Object... values) {
    return query(org.neo4j.kernel.api.impl.schema.LuceneDocumentStructure.newSeekQuery(values));
}