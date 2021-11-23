@org.junit.Test
public void testMethod_equals() {
    final com.civilizer.domain.FileEntity f0 = new com.civilizer.domain.FileEntity("/whatever.txt");
    final com.civilizer.domain.FileEntity f1 = new com.civilizer.domain.FileEntity("/whatever.txt");
    final com.civilizer.domain.FileEntity f2 = new com.civilizer.domain.FileEntity("/another.txt");
    assertEquals(true, f0.equals(f1));
    assertEquals(false, f2.equals(f1));
}