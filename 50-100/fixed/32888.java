@org.junit.Test
public void should_map_collection_of_units() throws java.lang.Exception {
    java.util.List<com.jaspersoft.android.sdk.network.entity.schedule.JobUnitEntity> entities = java.util.Collections.singletonList(mJobUnitEntity);
    java.util.List<com.jaspersoft.android.sdk.service.data.schedule.JobUnit> expected = mJobUnitMapper.transform(entities);
    org.hamcrest.MatcherAssert.assertThat(expected.size(), org.hamcrest.Matchers.is(1));
}