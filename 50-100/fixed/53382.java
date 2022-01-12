@java.lang.Override
protected void createSubChart(org.eclipse.swt.widgets.Composite sectionClient) {
    org.eclipse.swt.widgets.Composite chartComposite = toolkit.createComposite(sectionClient);
    org.eclipse.swt.layout.GridLayout tableLayout = new org.eclipse.swt.layout.GridLayout(1, java.lang.Boolean.TRUE);
    chartComposite.setLayout(tableLayout);
    org.eclipse.swt.layout.GridData gridData = new org.eclipse.swt.layout.GridData(org.eclipse.swt.layout.GridData.FILL_BOTH);
    chartComposite.setLayoutData(gridData);
    matchRuleChartComp = new org.talend.dataquality.record.linkage.ui.composite.chart.MatchRuleDataChart(chartComposite, new java.util.HashMap<java.lang.Object, java.lang.Long>());
    if (!(org.talend.dataquality.record.linkage.ui.composite.chart.TOPChartUtil.getInstance().isTOPChartInstalled())) {
        return ;
    }
    createHideGroupComposite(chartComposite);
}