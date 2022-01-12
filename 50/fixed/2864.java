@org.junit.Test
public void testDefaultPreparationDelay() {
    org.assertj.core.api.Assertions.assertThat(info.getPreparationDelay()).as("preparationDelay").isEqualTo(0);
}