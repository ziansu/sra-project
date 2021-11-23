@org.junit.Test(expected = java.lang.IllegalArgumentException.class)
public void shouldThrowExceptionWhenAddNonUniqueElement() throws java.lang.Exception {
    set.add(10);
}