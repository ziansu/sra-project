@org.junit.Test
public void givenAnnotatedSrcFields_whenMapsToRightDestFieldBidirectionally_thenCorrect() {
    com.baeldung.dozer.Personne2 frenchAppPerson = new com.baeldung.dozer.Personne2("Jason Statham", "transporter", 49);
    com.baeldung.dozer.Person2 englishAppPerson = mapper.map(frenchAppPerson, com.baeldung.dozer.Person2.class);
    org.junit.Assert.assertEquals(englishAppPerson.getName(), frenchAppPerson.getNom());
    org.junit.Assert.assertEquals(englishAppPerson.getNickname(), frenchAppPerson.getSurnom());
    org.junit.Assert.assertEquals(englishAppPerson.getAge(), frenchAppPerson.getAge());
}