@org.junit.Test
public void positiveRules() {
    org.sonar.sslr.tests.Assertions.assertThat(parser).matches("1").matches("true").matches("false").matches("'something'").matches("someIdentifier").matches("a.b.c").matches("this.something").matches("super.something").matches("something.something").matches("(anExpression)").matches("(a.b.c)").matches("(++x)").matches("(4-3*x-y+--+-z-2)").matches("(null)").matches("(x = z = 3-5)").matches("(x ? y : z)");
}