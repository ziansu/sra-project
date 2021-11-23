@java.lang.Override
public boolean accepts(com.buschmais.jqassistant.plugin.common.api.scanner.filesystem.FileResource item, java.lang.String path, com.buschmais.jqassistant.core.scanner.api.Scope scope) throws java.io.IOException {
    return path.endsWith(".class");
}