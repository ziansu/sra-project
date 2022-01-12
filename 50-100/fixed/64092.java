@org.jetbrains.annotations.NotNull
@java.lang.Override
public UI5ProjectTemplateGenerator.UI5ProjectSettings getSettings() {
    java.lang.String appType = getSelectedButton(applicationTypeButtonGroup).toUpperCase();
    java.lang.String viewType = getSelectedButton(viewTypeButtonGroup);
    com.atsebak.ui5.config.UI5Library library = com.atsebak.ui5.config.UI5Library.valueOf(appType);
    com.atsebak.ui5.autogeneration.UI5View view = com.atsebak.ui5.util.UI5FileBuilder.getViewImplementation(com.atsebak.ui5.config.UI5Type.valueOf(viewType));
    settings.setLibrary(library);
    settings.setView(view);
    return settings;
}