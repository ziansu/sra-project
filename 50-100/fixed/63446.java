@java.lang.Override
protected void testDate() throws java.text.ParseException {
    org.molgenis.data.Query<org.molgenis.data.Entity> query = new org.molgenis.data.support.QueryImpl().search(org.molgenis.integrationtest.data.abstracts.query.BIRTHDAY, "1950-01-31");
    java.util.Set<org.molgenis.data.Entity> resultSet = newHashSet(person3);
    org.testng.Assert.assertTrue(resultSet.contains(personsRepository.findOne(query)));
    org.testng.Assert.assertEquals(personsRepository.findAll(query).collect(java.util.stream.Collectors.toSet()), resultSet);
    org.testng.Assert.assertEquals(personsRepository.count(query), resultSet.size());
}