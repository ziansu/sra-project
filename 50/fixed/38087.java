private void startDefaultConsole() {
    try {
        service.Service defaultConsoleService = new console.ConsoleService("Console for me");
        defaultConsoleService.addObserver(this);
        service.Service.startService(defaultConsoleService);
    } catch (service.Service.AlreadyStartException e) {
        master.MasterConsole.log.debug("AlreadyStartException", e);
    }
}