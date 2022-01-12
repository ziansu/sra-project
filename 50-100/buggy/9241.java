@org.junit.Test
public void givenAnnotatedSrcFields_whenMapsToRightDestField_thenCorrect() {
    com.baeldung.dozer.Person2 englishAppPerson = new com.baeldung.dozer.Person2("Jean-Claude Van Damme", "JCVD", 55);
    com.baeldung.dozer.Personne2 frenchAppPerson = mapper.map(englishAppPerson, com.baeldung.dozer.Personne2.class);
    org.junit.Assert.assertEquals(frenchAppPerson.getNom(), englishAppPerson.getName());
    org.junit.Assert.assertEquals(frenchAppPerson.getSurnom(), englishAppPerson.getNickname());
    org.junit.Assert.assertEquals(frenchAppPerson.getAge(), englishAppPerson.getAge());
}