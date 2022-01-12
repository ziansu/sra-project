private static void assertDataSetEqualsDbModel(final uk.co.onsdigital.discovery.metadata.api.model.DataSet actual, final uk.co.onsdigital.discovery.model.DimensionalDataSet expected) {
    org.assertj.core.api.Assertions.assertThat(actual.getId()).isEqualTo(expected.getDimensionalDataSetId().toString());
    org.assertj.core.api.Assertions.assertThat(actual.getS3URL()).isEqualTo(expected.getS3URL());
}