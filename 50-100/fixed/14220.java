public static void checkConnection(@org.jetbrains.annotations.NotNull
net.groboclown.idea.p4ic.v2.server.connection.ProjectConfigSource source, @org.jetbrains.annotations.NotNull
net.groboclown.idea.p4ic.v2.server.connection.ServerConnectionManager connectionManager) throws com.intellij.openapi.vcs.VcsException, java.io.IOException, java.net.URISyntaxException {
    final com.intellij.openapi.project.Project project = source.getProject();
    final net.groboclown.idea.p4ic.v2.server.connection.ServerConnection connection = connectionManager.getConnectionFor(project, source.getClientServerId(), source.getServerConfig(), false);
    net.groboclown.idea.p4ic.v2.server.connection.ClientExec exec = connection.oneOffClientExec();
    try {
        new net.groboclown.idea.p4ic.v2.server.connection.P4Exec2(source.getProject(), exec).getServerInfo();
    } finally {
        exec.dispose();
    }
}