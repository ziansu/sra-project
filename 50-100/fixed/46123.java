private de.kontext_e.jqassistant.plugin.findbugs.store.descriptor.SourceLineDescriptor createSourceLineDescriptor(final com.buschmais.jqassistant.core.store.api.Store store, final de.kontext_e.jqassistant.plugin.findbugs.jaxb.SourceLineType bugInstanceTypeSourceLine) {
    final de.kontext_e.jqassistant.plugin.findbugs.store.descriptor.SourceLineDescriptor sourceLineDescriptor = store.create(de.kontext_e.jqassistant.plugin.findbugs.store.descriptor.SourceLineDescriptor.class);
    if (bugInstanceTypeSourceLine != null) {
        sourceLineDescriptor.setClassname(bugInstanceTypeSourceLine.getClassname());
        sourceLineDescriptor.setStart(bugInstanceTypeSourceLine.getStart());
        sourceLineDescriptor.setEnd(bugInstanceTypeSourceLine.getEnd());
        sourceLineDescriptor.setSourcefile(bugInstanceTypeSourceLine.getSourcefile());
        sourceLineDescriptor.setSourcepath(bugInstanceTypeSourceLine.getSourcepath());
    }
    return sourceLineDescriptor;
}