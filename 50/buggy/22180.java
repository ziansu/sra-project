@org.junit.Test
public void add() {
    float result = Calculator.ADD.apply(2, 7);
    org.assertj.core.api.Assertions.assertThat(result).isEqualTo(9);
}