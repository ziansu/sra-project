@java.lang.Override
public org.talend.core.model.process.IProcess getProcessFromItem(org.talend.core.model.properties.Item item, boolean loadScreenshots) {
    if ((org.talend.core.model.properties.impl.ProcessItemImpl.class) == (item.getClass())) {
        java.lang.Process process = null;
        process = new java.lang.Process(item.getProperty());
        process.loadXmlFile(loadScreenshots);
        return process;
    }
    return null;
}