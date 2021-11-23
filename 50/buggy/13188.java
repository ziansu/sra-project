@net.thucydides.core.annotations.Step
public void shouldBeBilled(int billedPrice, int totalPrice) {
    org.fest.assertions.Assertions.assertThat(billedPrice).isEqualTo(totalPrice);
    throw new cucumber.runtime.CucumberException("Oh crap");
}