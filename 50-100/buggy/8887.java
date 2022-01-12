@org.junit.Test
public void whenCheckingFitnessFeatureThrowsException_thenCorrespondingFitnessFeatureShouldBeFalse() {
    org.corpus_tools.pepper.modules.PepperModule module = org.mockito.Mockito.mock(org.corpus_tools.pepper.modules.PepperModule.class);
    org.mockito.Mockito.when(module.getDesc()).thenThrow(new java.lang.RuntimeException());
    org.assertj.core.api.Assertions.assertThat(new org.corpus_tools.pepper.core.ModuleFitnessChecker(null).checkFitness(module).getFitness(FitnessFeature.HAS_NAME)).isEqualTo(false);
}