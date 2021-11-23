public void execute(backtype.storm.tuple.Tuple tuple) {
    try {
        java.lang.Double indexValue = tuple.getDouble(0);
        byte[] serializedTuple = schema.serializeTuple(tuple);
        numTuples += 1;
        tm.putChunkStartTime();
        indexTupleWithTemplates(indexValue, serializedTuple);
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}