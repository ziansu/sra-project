@org.junit.Test
public void givenSourceObjectAndDestObject_whenMapsSameNameFieldsCorrectly_thenCorrect() {
    com.baeldung.dozer.Source source = new com.baeldung.dozer.Source("Baeldung", 10);
    com.baeldung.dozer.Dest dest = new com.baeldung.dozer.Dest();
    mapper.map(source, dest);
    assertEquals(dest.getName(), "Baeldung");
    assertEquals(dest.getAge(), 10);
}