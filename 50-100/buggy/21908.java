@org.junit.Test
public void ifTrue_True_SringShouldNotBeAdded() {
    java.lang.String actual = io.schinzel.basicutils.str.Str.create().a("A").ifTrue(true).a("B").endIf().a("C").toString();
    java.lang.String expected = "AC";
    org.junit.Assert.assertEquals(expected, actual);
}