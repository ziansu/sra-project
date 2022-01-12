@org.junit.Test
public void TDP_3518_should_create_TRUE_predicate_on_double_quote() throws java.lang.Exception {
    final java.lang.String filtersDefinition = "\"\"";
    final java.util.function.Predicate<org.talend.dataprep.api.dataset.row.DataSetRow> filter = service.build(filtersDefinition, rowMetadata);
    org.junit.Assert.assertThat(filter.test(datasetRowFromValues), org.hamcrest.CoreMatchers.is(true));
}