@java.lang.Override
public void apply(final org.eclipse.emf.common.util.URI source, final org.eclipse.emf.common.util.URI target) {
    com.google.common.collect.Multimap<org.eclipse.emf.common.util.URI, org.eclipse.emf.common.util.URI> _generatedFile2sourceURI = this.xtextBuildResultCollector.getGeneratedFile2sourceURI();
    _generatedFile2sourceURI.put(source, target);
}