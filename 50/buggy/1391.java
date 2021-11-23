private void checkConf() {
    Control.InvokeProgram.killPuttyWarningsAndErrs();
    UI.MainFrame.configuration = new Control.Configuration(this);
}