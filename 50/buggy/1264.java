public void setMainApp(com.csulb.edu.set.MainApp mainApp) {
    this.mainApp = mainApp;
    documentsList.getItems().addAll(mainApp.getDocuments());
}