@org.junit.Test
public void greetShouldIncludeTheOneBeingGreeted() {
    java.lang.String someone = "World";
    org.junit.Assert.assertThat(greeter.greet(someone), org.junit.matchers.JUnitMatchers.containsString("someone"));
}