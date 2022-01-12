@org.junit.Test
public void testMap() {
    java.util.Map<java.lang.String, ?> map = com.aol.cyclops.lambda.api.AsMappable.asMappable(new com.aol.cyclops.lambda.mixins.CoerceToMapTest.MyEntity(10, "hello")).toMap();
    java.lang.System.out.println(map);
    org.junit.Assert.assertThat(map.get("num"), org.hamcrest.Matchers.equalTo(10));
    org.junit.Assert.assertThat(map.get("str"), org.hamcrest.Matchers.equalTo("hello"));
}