private io.cloudsoft.winrm4j.winrm.WinRmTool connect() {
    io.cloudsoft.winrm4j.winrm.WinRmTool.Builder builder = WinRmTool.Builder.builder(host, computerName, user, password).setAuthenticationScheme(authenticationScheme).useHttps(useSecureWinrm).port(port);
    if ((environment) != null) {
        builder.environment(environment);
    }
    if (useSecureWinrm) {
        builder.disableCertificateChecks(true);
    }
    return builder.build();
}