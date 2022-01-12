public static void updateGenomicViewer(boolean forceReload) {
    if ((currentSequence) == null) {
        com.google.gwt.core.client.GWT.log("Current sequence not set");
    }
    if (((org.bbop.apollo.gwt.client.MainPanel.currentStartBp) != null) && ((org.bbop.apollo.gwt.client.MainPanel.currentEndBp) != null)) {
        org.bbop.apollo.gwt.client.MainPanel.updateGenomicViewerForAssemblage(org.bbop.apollo.gwt.client.MainPanel.currentAssemblage, org.bbop.apollo.gwt.client.MainPanel.currentStartBp, org.bbop.apollo.gwt.client.MainPanel.currentEndBp, forceReload);
    }else {
        org.bbop.apollo.gwt.client.MainPanel.updateGenomicViewerForAssemblage(org.bbop.apollo.gwt.client.MainPanel.currentAssemblage, org.bbop.apollo.gwt.client.MainPanel.currentAssemblage.getStart(), org.bbop.apollo.gwt.client.MainPanel.currentAssemblage.getEnd(), forceReload);
    }
}