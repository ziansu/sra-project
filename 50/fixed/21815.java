@java.lang.Override
public long getCreationTime() {
    return java.lang.Math.round(new java.lang.Double(globalAttributes.get(com.github.mkopylec.sessioncouchbase.persistent.CouchbaseSession.CREATION_TIME_ATTRIBUTE).toString()));
}