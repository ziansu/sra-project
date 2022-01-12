@org.junit.Test
public void givenSourceAndDestWithDifferentFieldTypes_whenMapsAndAutoConverts_thenCorrect() {
    com.baeldung.dozer.Source2 source = new com.baeldung.dozer.Source2("320", 15.2);
    com.baeldung.dozer.Dest2 dest = mapper.map(source, com.baeldung.dozer.Dest2.class);
    org.junit.Assert.assertEquals(dest.getId(), 320);
    org.junit.Assert.assertEquals(dest.getPoints(), 15);
}