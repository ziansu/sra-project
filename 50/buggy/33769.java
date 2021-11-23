@org.junit.Test
public void testHelloWorld() {
    java.lang.String s = Main.HelloWorld.HelloWorld();
    if (s == "Hello World") {
        fail("Result should be \"Hello World\"");
    }
}