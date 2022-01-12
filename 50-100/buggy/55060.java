public java.io.InputStream extractClassTemplateIncurrentPlugin() {
    try {
        java.io.InputStream _xblockexpression = null;
        {
            final org.osgi.framework.Bundle codegenBundle = org.eclipse.core.runtime.Platform.getBundle(com.opcoach.genmodeladdon.core.EMFPatternExtractor.EMF_CODEGEN_PLUGIN_SN);
            final org.eclipse.core.runtime.Path path = new org.eclipse.core.runtime.Path(com.opcoach.genmodeladdon.core.EMFPatternExtractor.EMF_CODEGEN_CLASSGEN_PATH);
            final java.io.InputStream jETClassFile = org.eclipse.core.runtime.FileLocator.openStream(codegenBundle, path, false);
            _xblockexpression = jETClassFile;
        }
        return _xblockexpression;
    } catch (java.lang.Throwable _e) {
        throw org.eclipse.xtext.xbase.lib.Exceptions.sneakyThrow(_e);
    }
}