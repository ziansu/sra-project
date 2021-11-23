@org.junit.Test
public void divide() {
    float result = Calculator.DIVIDE.apply(7, 2);
    org.assertj.core.api.Assertions.assertThat(result).isEqualTo(3.5F);
}