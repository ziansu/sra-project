@org.junit.Test
public void modifyResponseType_TypeWithComponent_Test() throws com.spectralogic.ds3autogen.api.ResponseTypeNotFoundException {
    final com.google.common.collect.ImmutableList<com.spectralogic.ds3autogen.utils.Ds3ResponseType> responseTypes = getPopulatedDs3ResponseTypeList();
    final com.google.common.collect.ImmutableList<com.spectralogic.ds3autogen.utils.Ds3ResponseType> tapePartitionArray = getSpecifiedResponseType(responseTypes, "array", "TapePartition");
    assertThat(tapePartitionArray.size(), org.hamcrest.Matchers.is(1));
    assertThat(tapePartitionArray.get(0).getType(), org.hamcrest.Matchers.is("array"));
    assertTrue(tapePartitionArray.get(0).getComponentType().endsWith(".TapePartition"));
}