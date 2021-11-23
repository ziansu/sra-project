private long testVanillaGson() {
    long start = java.lang.System.nanoTime();
    gsonpath.vanilla.PeopleModelVanilla vanillaModel = vanillaGson.fromJson(gsonpath.PeopleModelTest.JSON_TEST_STRING, gsonpath.vanilla.PeopleModelVanilla.class);
    long duration = ((java.lang.System.nanoTime()) - start) / 1000000;
    java.lang.System.out.println(("vanillaModel. Time taken: " + duration));
    org.junit.Assert.assertEquals(gsonpath.PeopleModelTest.PEOPLE_SIZE, vanillaModel.people.length);
    org.junit.Assert.assertEquals("Lachlan", vanillaModel.people[0].person.names.first);
    return duration;
}