@java.lang.Override
public void run() {
    aliasResolver.refreshMap();
    configAdapter.resolveAliases(aliasResolver);
}