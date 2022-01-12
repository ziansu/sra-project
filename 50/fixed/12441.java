@java.lang.Override
public org.elasticsearch.action.ingest.SimulateDocumentSimpleResult readFrom(org.elasticsearch.common.io.stream.StreamInput in) throws java.io.IOException {
    if (in.readBoolean()) {
        java.lang.Exception exception = in.readThrowable();
        return new org.elasticsearch.action.ingest.SimulateDocumentSimpleResult(exception);
    }
    return new org.elasticsearch.action.ingest.SimulateDocumentSimpleResult(new org.elasticsearch.action.ingest.WriteableIngestDocument(in));
}