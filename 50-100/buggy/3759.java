@java.lang.Override
protected void testDecimal() {
    org.molgenis.data.Query<org.molgenis.data.Entity> query = new org.molgenis.data.support.QueryImpl().search(org.molgenis.integrationtest.data.abstracts.query.ACCOUNT_BALANCE, "1000 ");
    java.util.Set<org.molgenis.data.Entity> resultSet = org.elasticsearch.common.collect.Sets.newHashSet(person3);
    org.testng.Assert.assertTrue(resultSet.contains(personsRepository.findOne(query)));
    org.testng.Assert.assertEquals(personsRepository.findAll(query).collect(java.util.stream.Collectors.toSet()), resultSet);
    org.testng.Assert.assertEquals(personsRepository.count(query), resultSet.size());
}