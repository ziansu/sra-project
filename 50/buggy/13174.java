@java.lang.Override
public void dispose() {
    resourceManager.dispose();
    if ((this.viewer) != null)
        org.eclipse.core.resources.ResourcesPlugin.getWorkspace().removeResourceChangeListener(this);
    
    super.dispose();
}