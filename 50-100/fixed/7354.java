@java.lang.Override
public java.lang.Object call(java.lang.Object target) throws java.lang.Exception {
    java.lang.String[] bashArgs = ((bb.mbaas.api.elements.SDKBashButton) (runBtn)).getBashArgs();
    bb.mbaas.api.GlobalProperties globalProperties = new bb.mbaas.api.GlobalProperties();
    java.lang.String testSuitePath = projPathTF.getText();
    bashArgs[2] = testSuitePath;
    ((bb.mbaas.api.elements.SDKBashButton) (runBtn)).refreshBashArgs(bashArgs);
    return null;
}