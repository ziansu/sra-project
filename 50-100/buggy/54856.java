@org.junit.Test
public void shouldReturnTrueForIsInSimulationEnvironment() {
    tds.session.ExternalSessionConfiguration externalSessionConfiguration = new tds.session.ExternalSessionConfiguration("UNIT_TEST", "Simulation", 0, 0);
    org.assertj.core.api.Assertions.assertThat(externalSessionConfiguration.isInSimulationEnvironment()).isTrue();
    org.assertj.core.api.Assertions.assertThat(externalSessionConfiguration.isInDevelopmentEnvironment()).isFalse();
}