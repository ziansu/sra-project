@org.junit.Test
public void whenModuleHasNoSupplierContact_thenCorrespondingFitnessFeatureShouldBeTrue() {
    org.corpus_tools.pepper.modules.PepperModule module = org.mockito.Mockito.mock(org.corpus_tools.pepper.modules.PepperModule.class);
    org.mockito.Mockito.when(module.getSupplierContact()).thenReturn(null);
    org.assertj.core.api.Assertions.assertThat(new org.corpus_tools.pepper.core.ModuleFitnessChecker(null).checkFitness(module).getFitness(FitnessFeature.HAS_SUPPLIER_CONTACT)).isEqualTo(false);
}