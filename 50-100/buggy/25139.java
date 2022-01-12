@org.junit.Test
public void whenModuleHasName_thenCorrespondingFitnessFeatureShouldBeTrue() {
    org.corpus_tools.pepper.modules.PepperModule module = org.mockito.Mockito.mock(org.corpus_tools.pepper.modules.PepperModule.class);
    org.mockito.Mockito.when(module.getName()).thenReturn("MyModule");
    org.assertj.core.api.Assertions.assertThat(new org.corpus_tools.pepper.core.ModuleFitnessChecker(null).checkFitness(module).getFitness(FitnessFeature.HAS_NAME)).isEqualTo(true);
}