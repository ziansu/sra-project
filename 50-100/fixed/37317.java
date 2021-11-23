public java.lang.String uninstallPackage(java.lang.String id, java.lang.String packageName) {
    com.globo.teste.model.Server server = getServerById(id);
    com.globo.teste.ssh.CommandBuilder builder = com.globo.teste.ssh.CommandBuilderFactory.getBuilder(server);
    com.globo.teste.ssh.RemoteCommand cmd = new com.globo.teste.ssh.RemoteCommand(builder.uninstallPackageCommand(packageName));
    cmd.setSudo(true);
    java.lang.String result = cmd.execute(server);
    if (!(this.hasPackage(server, packageName))) {
        return result;
    }
    return null;
}