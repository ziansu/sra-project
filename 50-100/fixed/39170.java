@org.junit.Test
public void givenApiMapper_whenMapsOnlySpecifiedFields_thenCorrect() {
    com.baeldung.dozer.Person englishAppPerson = new com.baeldung.dozer.Person("Sylvester Stallone", "Rambo", 70);
    mapper.addMapping(builderMinusAge);
    com.baeldung.dozer.Personne frenchAppPerson = mapper.map(englishAppPerson, com.baeldung.dozer.Personne.class);
    assertEquals(frenchAppPerson.getNom(), englishAppPerson.getName());
    assertEquals(frenchAppPerson.getSurnom(), englishAppPerson.getNickname());
    assertEquals(frenchAppPerson.getAge(), 0);
}