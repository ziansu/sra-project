static org.verapdf.processor.ItemProcessor newProcessor(final org.verapdf.processor.ProcessorConfig config, final org.verapdf.component.ComponentDetails details) {
    org.verapdf.core.utils.FileOutputMapper mapper = org.verapdf.processor.ProcessorImpl.defautMdFixMapper;
    if (org.verapdf.processor.ProcessorImpl.isMdFolder(config.getMetadataFolder())) {
        mapper = org.verapdf.core.utils.FileOutputMappers.verFold(config.getMetadataFolder(), config.getFixerConfig().getFixesPrefix());
    }else {
        mapper = org.verapdf.core.utils.FileOutputMappers.verSibFiles(config.getFixerConfig().getFixesPrefix());
    }
    return org.verapdf.processor.ProcessorImpl.newProcessor(config, details, mapper);
}