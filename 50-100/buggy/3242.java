@javafx.fxml.FXML
public void saveAction() {
    myProject.model.SettingsConstants.setStartAnalysisWithAppStart3(radioStartAnalysisWithAppStart.isSelected());
    myProject.model.SettingsConstants.setSaveReportsAutomatically4(radioSaveReportsAuto.isSelected());
    myProject.model.SettingsConstants.setSliderSize5(sliderSize.getValue());
    myProject.model.SettingsConstants.setSliderNumber6(sliderNumber.getValue());
    myProject.model.SettingsConstants.setStartAppWithWindows(radioStartAppWithWin.isSelected());
    java.lang.System.out.println(("::: " + (radioStartAppWithWin.isSelected())));
    myProject.view.MainWindowController.getOptionStage().close();
}