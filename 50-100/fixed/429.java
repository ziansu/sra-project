@org.junit.Test
public void testAppend() {
    dk.kontentsu.model.Term test = term1.append("test2");
    assertEquals(term2.getFullPath(), test.getFullPath());
    assertEquals(term3.getFullPath(), term1.append("test2/test3").getFullPath());
    dk.kontentsu.model.Term testTerm = new dk.kontentsu.model.Term("test2").append(new dk.kontentsu.model.Term("TEST3"));
    term1.append(testTerm.getParent().get());
    assertEquals(term3.getFullPath(), testTerm.getFullPath());
}