@javax.annotation.Nullable
@java.lang.Override
public org.spine3.server.entity.storage.EntityRecordEnvelope apply(@javax.annotation.Nullable
org.spine3.server.entity.EntityRecord record) {
    if (record == null) {
        return null;
    }
    return new org.spine3.server.entity.storage.EntityRecordEnvelope(record, java.util.Collections.<java.lang.String, java.lang.Object>emptyMap());
}