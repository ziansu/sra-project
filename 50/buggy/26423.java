@java.lang.Override
public com.constellio.model.entities.records.Record get(java.lang.String id) {
    return onlyIfNotSummary(getSummary(id));
}