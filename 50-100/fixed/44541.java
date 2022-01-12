@java.lang.Override
public void updateGuiAfterBuild(de.ovgu.featureide.core.IFeatureProject project, org.eclipse.core.resources.IFile configurationFile) {
    boolean isVisible = getSite().getPage().isPartVisible(getSite().getPart());
    if (isVisible) {
        if ((project != null) && (configurationFile != null)) {
            refresh(true);
        }
    }
}