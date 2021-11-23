@java.lang.Override
public void execute() {
    if ((dataImportFileChooser_.getText()) != (importOptions_.getImportLocation())) {
        lastSuccessfulResponse_ = null;
        localFiles_ = null;
        resetColumnDefinitions();
    }
    importOptions_.setImportLocation((!(dataImportFileChooser_.getText().isEmpty()) ? dataImportFileChooser_.getText() : null));
    dataImportOptionsUi_.clearOptions();
    dataImportOptionsUi_.setImportLocation(dataImportFileChooser_.getText());
    previewDataImport();
}