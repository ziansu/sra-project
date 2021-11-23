@org.junit.Test
public void test1() {
    java.lang.String str1 = hello.printNumber(1);
    java.lang.System.out.println(str1);
    assert str1.equals("One");
}