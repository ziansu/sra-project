@org.junit.Test
public void ifTrue_False_SringShouldNotBeAdded() {
    java.lang.String actual = io.schinzel.basicutils.str.Str.create().a("A").ifTrue(false).a("B").endIf().a("C").toString();
    java.lang.String expected = "ABC";
    org.junit.Assert.assertEquals(expected, actual);
}