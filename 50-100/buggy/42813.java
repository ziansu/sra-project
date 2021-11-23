@org.junit.Test
public void modifyResponseType_TypeWithComponent_Test() throws com.spectralogic.ds3autogen.api.ResponseTypeNotFoundException {
    final com.google.common.collect.ImmutableList<com.spectralogic.ds3autogen.utils.Ds3ResponseType> responseTypes = getPopulatedDs3ResponseTypeList();
    final com.google.common.collect.ImmutableList<com.spectralogic.ds3autogen.utils.Ds3ResponseType> tapePartitionArray = getSpecifiedResponseType(responseTypes, "TapePartition", "array");
    assertThat(tapePartitionArray.size(), org.hamcrest.Matchers.is(1));
    assertTrue(tapePartitionArray.get(0).getType().endsWith(".TapePartition"));
    assertThat(tapePartitionArray.get(0).getComponentType(), org.hamcrest.Matchers.is("array"));
}