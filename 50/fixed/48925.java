@java.lang.Override
public long getModified() {
    return this.s3ObjectSummary.getLastModified().getTime();
}