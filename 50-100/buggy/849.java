private void createMainView() {
    mainViewModel = new opdracht1d.ViewModels.MainViewModel();
    mainPanel = new opdracht1d.UI.MainPanel(mainViewModel);
    mainPanel.setDatumZoekenListener(new opdracht1d.Controllers.ReservationController.MainViewDatumZoekenButton());
    mainPanel.setHuisZoekenListener(new opdracht1d.Controllers.ReservationController.MainViewHuisZoekenButton());
    mainPanel.setNieuweReservatieListener(new opdracht1d.Controllers.ReservationController.MainViewNieuweReservatieButton());
    mainPanel.setTableListener(new opdracht1d.Controllers.ReservationController.MainViewSelection());
}