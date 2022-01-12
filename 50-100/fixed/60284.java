@java.lang.Override
public void initialize(org.eclipse.ui.application.IWorkbenchConfigurer configurer) {
    java.lang.System.setProperty("pydev.funding.hide", "true");
    org.eclipse.ui.ide.IDE.registerAdapters();
    super.initialize(configurer);
    java.lang.System.setProperty("sun.awt.noerasebackground", "true");
    boolean doSaveRestore = gda.configuration.properties.LocalProperties.check(LocalProperties.GDA_GUI_SAVE_RESTORE, true);
    configurer.setSaveAndRestore(doSaveRestore);
    declareDefaultImages(configurer);
    removeUnusedPreferencePages();
}