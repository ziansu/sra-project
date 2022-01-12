@java.lang.Override
protected void testInt() {
    org.molgenis.data.Query<org.molgenis.data.Entity> query = new org.molgenis.data.support.QueryImpl().search(org.molgenis.integrationtest.data.abstracts.query.HEIGHT, java.lang.String.valueOf(165));
    java.util.Set<org.molgenis.data.Entity> resultSet = newHashSet(person2);
    org.testng.Assert.assertTrue(resultSet.contains(personsRepository.findOne(query)));
    org.testng.Assert.assertEquals(personsRepository.findAll(query).collect(java.util.stream.Collectors.toSet()), resultSet);
    org.testng.Assert.assertEquals(personsRepository.count(query), resultSet.size());
}