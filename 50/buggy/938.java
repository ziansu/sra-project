@java.lang.Override
public org.dtls.fairifier.Model loadModel(java.lang.String projectId) throws java.io.IOException {
    return org.dtls.fairifier.FileSystemRdfSkeletonImpl.rdfSkeletonJsonTransformerImpl.read(java.nio.file.Paths.get(org.dtls.fairifier.FileSystemRdfSkeletonImpl.SAVELOCATION.toString(), projectId, ".skeleton.json"));
}