@java.lang.Override
public boolean exist(java.lang.String key) {
    return (this.classLoader.getClass().getResource(((root) + key))) != null;
}