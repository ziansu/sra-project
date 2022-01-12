public static void main(java.lang.String[] args) throws java.io.IOException {
    application.Application.loadsave = new utility.LoadSave();
    application.Application.model = application.Application.initModel(application.Application.modelFilename, application.Application.loadsave);
    application.Application.loadsave.saveModel(application.Application.model, application.Application.modelFilename);
    application.Application.initAuxiliaryController();
    java.awt.KeyboardFocusManager manager = java.awt.KeyboardFocusManager.getCurrentKeyboardFocusManager();
    manager.addKeyEventPostProcessor(new application.EnterKeyListener(application.Application.model));
    application.Application.launchModel(application.Application.updatesPerSecond);
}