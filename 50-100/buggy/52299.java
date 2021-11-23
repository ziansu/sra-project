@java.lang.Override
public void start(javafx.stage.Stage primaryStage) throws java.lang.Exception {
    this.primaryStage = primaryStage;
    companyNameList = javafx.collections.FXCollections.observableArrayList(qcha.arfind.utils.ConfigFileUtils.extractCompanyNames(qcha.arfind.utils.ConfigFileUtils.readCompanies()));
    initMainWindow(primaryStage);
    if (!(java.nio.file.Files.exists(java.nio.file.Paths.get(qcha.arfind.utils.Constants.ConfigFileConstants.CONFIG_FILENAME)))) {
        new qcha.arfind.SetConfigurationWarning(this);
    }
}