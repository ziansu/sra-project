@org.junit.Test
public void testValuesAsList() {
    final java.util.List<java.lang.@org.eclipse.jdt.annotation.NonNull
    String> blist = this.base.valuesToList("a1");
    assertTrue(blist.isEmpty());
    final java.util.List<java.lang.@org.eclipse.jdt.annotation.NonNull
    String> elist = this.example.valuesToList("a1");
    assertFalse(elist.isEmpty());
    assertSame(1, elist.size());
}