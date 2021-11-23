@java.lang.Override
public solidstack.io.Resource resolve(java.lang.String path) {
    return solidstack.io.Resources.getResource(this.uri.resolve(path));
}