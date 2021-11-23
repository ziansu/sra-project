@org.junit.Test
public void whenModuleIsReadyToRun_thenCorrespondingHealthFeatureShouldBeTrue() {
    org.corpus_tools.pepper.modules.PepperModule module = org.mockito.Mockito.mock(org.corpus_tools.pepper.modules.PepperModule.class);
    org.mockito.Mockito.when(module.isReadyToStart()).thenReturn(true);
    org.assertj.core.api.Assertions.assertThat(new org.corpus_tools.pepper.core.ModuleFitnessChecker(null).checkHealth(module).getFitness(FitnessFeature.IS_READY_TO_RUN)).isEqualTo(true);
}