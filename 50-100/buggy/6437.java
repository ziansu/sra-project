public void refresh() {
    refreshActionBars();
    de.ovgu.featureide.ui.UIPlugin.getDefault().logInfo("Team2: Collaboration Diagram -> refresh");
    final de.ovgu.featureide.core.fstmodel.FSTModel model = builder.buildCollaborationModel(featureProject);
    if (model == null) {
        de.ovgu.featureide.ui.UIPlugin.getDefault().logWarning(de.ovgu.featureide.fm.core.localization.StringTable.MODEL_LOADING_ERROR);
        return ;
    }
    org.eclipse.swt.widgets.Display.getDefault().syncExec(new java.lang.Runnable() {
        public void run() {
            viewer.setContents(model);
            viewer.getContents().refresh();
            search.refreshSearchContent();
        }
    });
}