@org.junit.Test
public void testJobWithMaxRowsFilter() throws java.lang.Exception {
    final org.datacleaner.job.builder.FilterComponentBuilder<org.datacleaner.components.maxrows.MaxRowsFilter, org.datacleaner.components.maxrows.MaxRowsFilter.Category> filter = analysisJobBuilder.addFilter(org.datacleaner.components.maxrows.MaxRowsFilter.class);
    filter.addInputColumn(analysisJobBuilder.getSourceColumnByName("email"));
    filter.getComponentInstance().setMaxRows(5);
    emailTransformerBuilder.setRequirement(filter, Category.VALID);
    final org.datacleaner.actions.PreviewTransformedDataActionListener action = new org.datacleaner.actions.PreviewTransformedDataActionListener(null, null, emailTransformerBuilder, 10);
    final javax.swing.table.TableModel tableModel = action.call();
    org.junit.Assert.assertEquals(10, tableModel.getRowCount());
}