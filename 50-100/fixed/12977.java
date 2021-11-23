@org.junit.Test
public void resolveClassWithDefaultScope() {
    java.lang.String match = "import foo;\n" + ((("\n" + "public class Foo {/*comment*/}\n") + "\n") + "\n");
    de.flapdoodle.codedoc.resolver.java.Reference ref = de.flapdoodle.codedoc.resolver.java.Reference.parse("foo.Foo").get();
    de.flapdoodle.codedoc.common.Either<de.flapdoodle.codedoc.CodeSample, java.lang.Error> result = new de.flapdoodle.codedoc.resolver.java.JavaSourceReferenceResolverImpl().resolve(ref, code);
    assertTrue(result.isLeft());
    assertEquals(match, result.left().code());
    assertEquals("java", result.left().type());
}