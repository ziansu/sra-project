@java.lang.Override
public void initialize(java.net.URL location, java.util.ResourceBundle resources) {
    radioStartAppWithWin.setSelected(SettingsConstants.START_APP_WITH_WINDOWS_7);
    radioStartAnalysisWithAppStart.setSelected(SettingsConstants.START_ANALYSIS_WITH_APP_START_3);
    radioSaveReportsAuto.setSelected(SettingsConstants.SAVE_REPORTS_AUTOMATICALLY_4);
    sliderSize.setValue(SettingsConstants.SLIDER_SIZE_5);
    sliderNumber.setValue(SettingsConstants.SLIDER_NUMBER_6);
    if (myProject.model.SettingsConstants.START_APP_WITH_WINDOWS_7) {
        radioStartAppWithWin.setSelected(true);
        radioStartAppWithWin.setDisable(true);
    }
    updateSliderL();
    java.lang.System.out.println("IN CNTRL!");
}