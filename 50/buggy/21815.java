@java.lang.Override
public long getCreationTime() {
    return java.lang.Math.round(((double) (globalAttributes.get(com.github.mkopylec.sessioncouchbase.persistent.CouchbaseSession.CREATION_TIME_ATTRIBUTE))));
}