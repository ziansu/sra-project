@org.testng.annotations.Test(dataProvider = "invalidAttachedDiskCreateSpecs")
public void testInvalidAttachedDiskCreateSpecs(com.vmware.photon.controller.api.AttachedDiskCreateSpec spec, java.lang.String errorMsg) {
    com.google.common.collect.ImmutableList<java.lang.String> violations = validator.validate(spec);
    org.hamcrest.MatcherAssert.assertThat(violations.size(), org.hamcrest.Matchers.is(1));
    org.hamcrest.MatcherAssert.assertThat(violations.get(0), org.hamcrest.Matchers.is(errorMsg));
}