@javafx.fxml.FXML
private void loginButtonPressed(javafx.event.ActionEvent __) {
    EmployeeContracts.IWorker worker = UtilsImplementations.InjectionFactory.getInstance(EmployeeImplementations.Worker.class, new EmployeeDI.WorkerDiConfigurator());
    try {
        worker.login(username, password);
    } catch (SMExceptions.SMException e) {
        EmployeeGui.EmployeeGuiExeptionHandler.handle(e);
        return ;
    }
    EmployeeCommon.TempWorkerPassingData.worker = worker;
    GuiUtils.AbstractApplicationScreen.setScene("/WorkerMenuScreen/WorkerMenuScreen.fxml");
}