@java.lang.Override
public void updateGuiAfterBuild(de.ovgu.featureide.core.IFeatureProject project, org.eclipse.core.resources.IFile configurationFile) {
    boolean isVisible = getSite().getPage().isPartVisible(getSite().getPart());
    if (isVisible) {
        de.ovgu.featureide.ui.UIPlugin.getDefault().logInfo("Team2: StatisticsView -> updateGuiAfterBuild");
        if ((project != null) && (configurationFile != null)) {
            de.ovgu.featureide.ui.UIPlugin.getDefault().logInfo("Team2: StatisticsView -> updateGuiAfterBuild -> refresh");
            refresh(true);
        }
    }
}