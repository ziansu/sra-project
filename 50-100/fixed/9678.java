@org.junit.Test
public void booleanWorks() {
    org.assertj.core.api.Assertions.assertThat(prefs.hasGuestFlag()).isFalse();
    org.assertj.core.api.Assertions.assertThat(prefs.getGuestFlag(true)).isTrue();
    prefs.putGuestFlag(true);
    org.assertj.core.api.Assertions.assertThat(prefs.hasGuestFlag()).isTrue();
    org.assertj.core.api.Assertions.assertThat(prefs.getGuestFlag()).isTrue();
    prefs.removeGuestFlag();
    org.assertj.core.api.Assertions.assertThat(prefs.hasGuestFlag()).isFalse();
}