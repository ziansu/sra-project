@java.lang.Override
protected java.lang.String doInBackground(openscience.crowdsource.video.experiments.RecognitionScenarioService... arg0) {
    openscience.crowdsource.video.experiments.RecognitionScenarioService.loadRecognitionScenariosFromServer();
    openscience.crowdsource.video.experiments.AppConfigService.updateState(AppConfigService.AppConfig.State.READY);
    if ((arg0[0]) != null) {
        arg0[0].update();
    }
    publishProgress("Finished pre-loading shared scenarios for crowdsourcing!\n\n");
    publishProgress("Crowd engine is READY!\n");
    return null;
}