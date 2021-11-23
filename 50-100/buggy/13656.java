private void deleteGemFile(org.sonatype.nexus.ruby.GemFile file) {
    store.retrieve(file);
    try (java.io.InputStream is = store.getInputStream(file)) {
        org.sonatype.nexus.ruby.GemspecHelper spec = gateway.newGemspecHelperFromGem(is);
        deleteSpecFromIndex(spec.gemspec());
        delete(super.dependencyFile(spec.name()));
        delete(super.gemspecFile(file.filename()));
        store.delete(file);
    } catch (java.io.IOException e) {
        file.setException(e);
    }
}