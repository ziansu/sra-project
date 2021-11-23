@org.junit.Test
public void testSayHelloAFewTimes() {
    java.io.OutputStream os = new java.io.ByteArrayOutputStream();
    java.io.PrintStream stream = new java.io.PrintStream(os, true);
    com.example.javamavenjunithelloworld.Hello hi = new com.example.javamavenjunithelloworld.Hello();
    hi.setTimes(3);
    hi.sayHello(stream);
    java.lang.String goal = (((((Hello.HELLO) + "\r\n") + (Hello.HELLO)) + "\r\n") + (Hello.HELLO)) + "\r\n";
    assertThat(os.toString(), is(equalTo(goal)));
}