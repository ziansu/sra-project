@java.lang.Override
public java.lang.String process(java.lang.String input, java.lang.Class<?> scope, java.lang.String name) {
    java.lang.String compressed = input;
    for (org.apache.wicket.css.ICssCompressor compressor : compressors) {
        if (compressor instanceof org.apache.wicket.resource.IScopeAwareTextResourceProcessor) {
            org.apache.wicket.resource.IScopeAwareTextResourceProcessor processor = ((org.apache.wicket.resource.IScopeAwareTextResourceProcessor) (compressor));
            compressed = processor.process(compressed, scope, name);
        }else {
            compressed = compressor.compress(compressed);
        }
    }
    return compressed;
}