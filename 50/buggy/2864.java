@org.junit.Test
public void testDefaultPreparationDelay() {
    org.assertj.core.api.Assertions.assertThat(shadowMediaPlayer.getDefaultMediaInfo().getPreparationDelay()).as("preparationDelay").isEqualTo(0);
}