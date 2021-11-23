@org.junit.Test
public void shouldReturnFalseForIsInSimulationEnvironmentAndIsInDevelopmentEnvironment() {
    tds.session.ExternalSessionConfiguration externalSessionConfiguration = new tds.session.ExternalSessionConfiguration("UNIT_TEST", "Production", 0, 0, 0, 0);
    org.assertj.core.api.Assertions.assertThat(externalSessionConfiguration.isInSimulationEnvironment()).isFalse();
    org.assertj.core.api.Assertions.assertThat(externalSessionConfiguration.isInDevelopmentEnvironment()).isFalse();
}