@java.lang.Override
public io.subutai.common.protocol.TemplateKurjun getTemplate(java.lang.String repository, java.lang.String name, java.lang.String version, boolean isKurjunClient) throws java.io.IOException {
    ai.subut.kurjun.metadata.common.DefaultMetadata m = new ai.subut.kurjun.metadata.common.DefaultMetadata();
    m.setName(name);
    m.setVersion(version);
    m.setFingerprint(repository);
    ai.subut.kurjun.model.metadata.template.SubutaiTemplateMetadata meta = ((ai.subut.kurjun.model.metadata.template.SubutaiTemplateMetadata) (unifiedRepository.getPackageInfo(m)));
    if (meta != null) {
        return convertToSubutaiTemplate(meta);
    }
    return null;
}