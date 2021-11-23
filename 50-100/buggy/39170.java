@org.junit.Test
public void givenApiMapper_whenMapsOnlySpecifiedFields_thenCorrect() {
    com.baeldung.dozer.Person englishAppPerson = new com.baeldung.dozer.Person("Sylvester Stallone", "Rambo", 70);
    mapper.addMapping(builderMinusAge);
    com.baeldung.dozer.Personne frenchAppPerson = mapper.map(englishAppPerson, com.baeldung.dozer.Personne.class);
    org.junit.Assert.assertEquals(frenchAppPerson.getNom(), englishAppPerson.getName());
    org.junit.Assert.assertEquals(frenchAppPerson.getSurnom(), englishAppPerson.getNickname());
    org.junit.Assert.assertEquals(frenchAppPerson.getAge(), 0);
}