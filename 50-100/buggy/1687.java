@org.junit.Test
public void testGetFileCount() {
    deleteCurrentProject();
    org.eclipse.core.resources.IFolder anaFolder = initFolder(EResourceConstant.ANALYSIS.getPath());
    org.eclipse.core.resources.IFolder repFolder = initFolder(EResourceConstant.REPORTS.getPath());
    org.talend.dataprofiler.core.ui.views.provider.ResourceViewLabelProvider reViewLabelProvider = new org.talend.dataprofiler.core.ui.views.provider.ResourceViewLabelProvider();
    int AnalysisNum = reViewLabelProvider.getFileCount(anaFolder, org.talend.dataprofiler.core.ui.views.provider.ResourceViewLabelProviderTest.filterExtensions);
    int reportNum = reViewLabelProvider.getFileCount(repFolder, org.talend.dataprofiler.core.ui.views.provider.ResourceViewLabelProviderTest.filterExtensions);
    assertEquals(AnalysisNum, 3);
    assertEquals(reportNum, 3);
}