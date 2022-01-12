@java.lang.Override
public com.espirit.moddev.cli.results.SimpleResult<java.lang.Boolean> call() {
    try (de.espirit.firstspirit.access.Connection connection = create()) {
        connection.connect();
        new com.espirit.moddev.moduleuninstaller.ModuleUninstaller().uninstall(connection, connection.getProjectByName(projectName).getId(), moduleName);
        return new com.espirit.moddev.cli.results.SimpleResult(true);
    } catch (java.io.IOException | de.espirit.firstspirit.server.authentication.AuthenticationException | de.espirit.firstspirit.common.MaximumNumberOfSessionsExceededException e) {
        return new com.espirit.moddev.cli.results.SimpleResult(e);
    }
}