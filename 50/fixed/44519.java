@java.lang.Override
public boolean exist(java.lang.String key) {
    return (this.classLoader.getResource(((root) + key))) != null;
}