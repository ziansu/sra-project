@org.junit.Test
public void givenSourceObjectAndDestClass_whenMapsSameNameFieldsCorrectly_thenCorrect() {
    com.baeldung.dozer.Source source = new com.baeldung.dozer.Source("Baeldung", 10);
    com.baeldung.dozer.Dest dest = mapper.map(source, com.baeldung.dozer.Dest.class);
    assertEquals(dest.getName(), "Baeldung");
    assertEquals(dest.getAge(), 10);
}