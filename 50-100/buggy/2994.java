public void testFetchAsync() {
    siena.core.async.QueryAsync<siena.base.test.model.PersonLongAutoIDModel> q = siena.base.test.model.PersonLongAutoIDModel.all().async();
    siena.core.async.SienaFuture<java.util.List<siena.base.test.model.PersonLongAutoIDModel>> future = q.fetch();
    java.util.List<siena.base.test.model.PersonLongAutoIDModel> persons = future.get();
    assertEquals(3, persons.size());
    assertEquals(siena.base.test.BaseModelTest.PERSON_LONGAUTOID_TESLA, persons.get(0));
    assertEquals(siena.base.test.BaseModelTest.PERSON_LONGAUTOID_CURIE, persons.get(1));
    assertEquals(siena.base.test.BaseModelTest.PERSON_LONGAUTOID_EINSTEIN, persons.get(2));
}