@java.lang.Override
protected java.lang.Object calculate() {
    return ((boolean) (super.calculate())) || ((libraryButton.getData(com.google.cloud.tools.eclipse.appengine.ui.AppEngineLibrariesSelectorGroup.BUTTON_MANUAL_SELECTION_KEY)) != null);
}