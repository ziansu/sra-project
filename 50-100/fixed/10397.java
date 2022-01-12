@org.junit.Test
@org.apache.sis.test.DependsOnMethod(value = "testPropertyOverride")
public void testPropertyDuplication() {
    org.apache.sis.feature.DefaultFeatureType city = org.apache.sis.feature.DefaultFeatureTypeTest.city();
    city = new org.apache.sis.feature.DefaultFeatureType(org.apache.sis.feature.DefaultFeatureTypeTest.name("New-City"), false, new org.apache.sis.feature.DefaultFeatureType[]{ org.apache.sis.feature.DefaultFeatureTypeTest.city() }, city.getProperty("city"));
    org.apache.sis.feature.DefaultFeatureTypeTest.assertPropertiesEquals(city, false);
    org.apache.sis.feature.DefaultFeatureTypeTest.assertPropertiesEquals(city, true, "city", "population");
}