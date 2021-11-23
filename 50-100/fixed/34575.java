@java.lang.Override
public java.util.Map<java.lang.Long, java.lang.String> call() throws java.lang.Exception {
    outputManager.flush();
    java.util.Map<java.lang.Long, java.lang.String> actual = new java.util.HashMap<>();
    for (co.cask.cdap.api.data.format.StructuredRecord outputRecord : co.cask.cdap.etl.mock.batch.MockSink.readOutput(outputManager)) {
        actual.put(((java.lang.Long) (outputRecord.get("id"))), (((outputRecord.get("first")) + " ") + (outputRecord.get("last"))));
    }
    return actual;
}