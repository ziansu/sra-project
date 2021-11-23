@org.junit.Test
public void whenModuleHasDescription_thenCorrespondingFitnessFeatureShouldBeTrue() {
    org.corpus_tools.pepper.modules.PepperModule module = org.mockito.Mockito.mock(org.corpus_tools.pepper.modules.PepperModule.class);
    org.mockito.Mockito.when(module.getDesc()).thenReturn("any description");
    org.assertj.core.api.Assertions.assertThat(new org.corpus_tools.pepper.core.ModuleFitnessChecker().checkFitness(module).getFitness(FitnessFeature.HAS_DESCRIPTION)).isEqualTo(true);
}