@java.lang.Override
public java.lang.String getExpandedSource() throws com.soartech.soar.ide.core.model.SoarModelException {
    com.soartech.soar.ide.core.model.impl.SoarAgent soarAgent = ((com.soartech.soar.ide.core.model.impl.SoarAgent) (soarFile.getAgent()));
    java.lang.String filename = soarFile.getFile().getPath().toOSString();
    org.eclipse.core.resources.IWorkspace workspace = org.eclipse.core.resources.ResourcesPlugin.getWorkspace();
    java.lang.String key = (((commandName) + (commandArgs)) + "-") + filename;
    java.lang.String ret = soarAgent.getExpandedSourceMap().get(key);
    return ret;
}