@org.junit.Test
public void givenApiMapper_whenMaps_thenCorrect() {
    com.baeldung.dozer.Personne frenchAppPerson = new com.baeldung.dozer.Personne("Sylvester Stallone", "Rambo", 70);
    mapper.addMapping(builder);
    com.baeldung.dozer.Person englishAppPerson = mapper.map(frenchAppPerson, com.baeldung.dozer.Person.class);
    org.junit.Assert.assertEquals(englishAppPerson.getName(), frenchAppPerson.getNom());
    org.junit.Assert.assertEquals(englishAppPerson.getNickname(), frenchAppPerson.getSurnom());
    org.junit.Assert.assertEquals(englishAppPerson.getAge(), frenchAppPerson.getAge());
}