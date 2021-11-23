@org.junit.Test
public void testNeedsCoverageByArtifactType() {
    final openfasttrack.core.SpecificationItem.Builder builder = new openfasttrack.core.SpecificationItem.Builder();
    builder.id(openfasttrack.core.TestSpecificationItem.ARTIFACT_TYPE, openfasttrack.core.TestSpecificationItem.NAME, openfasttrack.core.TestSpecificationItem.REVISION);
    builder.addNeedsArtifactType(openfasttrack.core.TestSpecificationItem.NEEDED_ARTIFACT_TYPE);
    builder.addNeedsArtifactType(openfasttrack.core.TestSpecificationItem.NOT_NEEDED_ARTIFACT_TYPE);
    final openfasttrack.core.SpecificationItem item = builder.build();
    org.junit.Assert.assertThat(item.needsCoverageByArtifactType(openfasttrack.core.TestSpecificationItem.NEEDED_ARTIFACT_TYPE), org.hamcrest.Matchers.equalTo(true));
    org.junit.Assert.assertThat(item.needsCoverageByArtifactType(openfasttrack.core.TestSpecificationItem.NOT_NEEDED_ARTIFACT_TYPE), org.hamcrest.Matchers.equalTo(false));
}