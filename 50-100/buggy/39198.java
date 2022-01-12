@java.lang.Override
public void loadState(org.jdom.Element state) {
    if (myProject.isInitialized()) {
        throw new java.lang.IllegalArgumentException("Project is not initialized yet. Please do not call CompilerManager inside #initCompoment()");
    }
    org.jdom.Element exclude = state.getChild("exclude-from-compilation");
    if (exclude != null) {
        myExcludedEntriesConfiguration.readExternal(exclude);
    }
    consulo.compiler.CompilerConfigurationImpl configuration = ((consulo.compiler.CompilerConfigurationImpl) (consulo.compiler.CompilerConfiguration.getInstance(myProject)));
    configuration.loadState(state);
}