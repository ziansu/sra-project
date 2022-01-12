@org.junit.Test
public void whenImporterDoesNotSupportIsImportable_thenCorrespondingFitnessFeatureShouldBeTrue() {
    org.corpus_tools.pepper.modules.PepperImporter importer = org.mockito.Mockito.mock(org.corpus_tools.pepper.modules.PepperImporter.class);
    org.mockito.Mockito.when(importer.isImportable(org.mockito.Matchers.any(org.eclipse.emf.common.util.URI.class))).thenReturn(null);
    org.assertj.core.api.Assertions.assertThat(new org.corpus_tools.pepper.core.ModuleFitnessChecker().checkFitness(importer).getFitness(FitnessFeature.IS_IMPORTABLE)).isEqualTo(false);
}