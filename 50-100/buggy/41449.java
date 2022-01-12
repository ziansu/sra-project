@org.junit.Test
public void should_get_names_by_directory_type() throws java.lang.Exception {
    java.lang.String query = ("get name in ('" + (directory)) + "') having type = 'directory';";
    fr.ogama.jfsql.query.Query fileQuery = fr.ogama.jfsql.query.QueryFactory.newQuery(query);
    java.util.List<java.lang.Comparable> results = fileQuery.execute();
    org.assertj.core.api.Assertions.assertThat(results).isNotNull().hasSize(2).hasOnlyElementsOfType(java.lang.String.class);
}