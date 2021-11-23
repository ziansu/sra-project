@org.junit.Test
public void positiveRules() {
    org.sonar.sslr.tests.Assertions.assertThat(parser).matches("(someType) someVariable").matches("(someType) --+-++5").matches("(someType) --!+x").matches("(string[]) x").matches("(list<someType>) x").matches("(map<integer, string>) x");
}