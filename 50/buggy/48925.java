@java.lang.Override
public long getModified() {
    return s3ObjectSummary.getLastModified().getTime();
}