private java.lang.Object lockFor(final java.lang.String fileName) {
    return this.fileLocks[((fileName.hashCode()) % (eu.fbk.knowledgestore.filestore.SynchronizedFileStore.NUM_LOCKS))];
}