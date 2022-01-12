@javax.annotation.Nullable
@java.lang.Override
public com.spectralogic.ds3client.helpers.JobPart apply(@javax.annotation.Nullable
final com.spectralogic.ds3client.models.BulkObject blob) {
    return new com.spectralogic.ds3client.helpers.JobPart(client(), blob);
}