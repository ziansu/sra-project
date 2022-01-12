@org.junit.Test
public void testGenericType() {
    main.addOptions("-show", "-progress", "-method=C");
    helpTCX("tt.TestJava", ("package tt; \n" + ((((((((("public class TestJava<T> extends B<T> { \n" + "  public void ma(T i) {\n") + "  }\n") + "}\n") + "class A<T> extends TestJava<B<T>> { \n") + "  public void mb(T i) {\n") + "  }\n") + "}\n") + "class B<E> {}\n") + "class C<F> extends java.util.LinkedList<B<F>> {}\n")));
}