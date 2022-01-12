@org.junit.Test
public void shouldGreetingWithPassingName() throws java.lang.Exception {
    demo.Hello hello = new demo.Hello();
    org.junit.Assert.assertEquals("Hello, Freewind!", hello.greeting("Freewind"));
}