@org.junit.Test
public void seedsAsListTest() {
    java.util.List<java.lang.String> seeds = new java.util.ArrayList<java.lang.String>();
    seeds.add(com.augminish.app.common.util.object.PropertyHashMapTest.seedTest[0]);
    seeds.add(com.augminish.app.common.util.object.PropertyHashMapTest.seedTest[1]);
    seeds.add(com.augminish.app.common.util.object.PropertyHashMapTest.seedTest[2]);
    org.junit.Assert.assertArrayEquals("PropertyHashMap should return values split into matching array", com.augminish.app.common.util.object.PropertyHashMapTest.seedTest, com.augminish.app.common.util.object.PropertyHashMapTest.propertyHashMap.getSeedAsArray());
    org.junit.Assert.assertEquals("PropertyHashMap should return values split into matching list", seeds, java.util.Arrays.asList(com.augminish.app.common.util.object.PropertyHashMapTest.propertyHashMap.getSeedAsArray()));
}