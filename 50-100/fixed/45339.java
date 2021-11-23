private long testGsonPath() {
    long start = java.lang.System.nanoTime();
    gsonpath.generated.PersonModelList personModelList = gsonPath.fromJson(new java.io.StringReader(gsonpath.PeopleModelTest.JSON_TEST_STRING), gsonpath.generated.PersonModelList.class);
    long duration = ((java.lang.System.nanoTime()) - start) / 1000000;
    java.lang.System.out.println(("gsonPathModel. Time taken: " + duration));
    org.junit.Assert.assertEquals(gsonpath.PeopleModelTest.PEOPLE_SIZE, personModelList.size());
    org.junit.Assert.assertEquals("Lachlan", personModelList.get(0).getFirstName());
    return duration;
}