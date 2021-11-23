@org.junit.Test
public void whenImporterSupportsIsImportable_thenCorrespondingFitnessFeatureShouldBeTrue() {
    org.corpus_tools.pepper.modules.PepperImporter module = org.mockito.Mockito.mock(org.corpus_tools.pepper.modules.PepperImporter.class);
    org.mockito.Mockito.when(module.isImportable(org.mockito.Matchers.any(org.eclipse.emf.common.util.URI.class))).thenReturn(1.0);
    org.assertj.core.api.Assertions.assertThat(new org.corpus_tools.pepper.core.ModuleFitnessChecker().checkFitness(module).getFitness(FitnessFeature.IS_IMPORTABLE)).isEqualTo(true);
}