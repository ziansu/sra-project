public com.bugull.mongo.fs.BuguFS createWithConnection(java.lang.String connectionName) {
    return create(connectionName, GridFS.DEFAULT_BUCKET, GridFS.DEFAULT_CHUNKSIZE);
}