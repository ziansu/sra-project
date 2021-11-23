@org.junit.Test
public void whenExportereHasFormats_thenCorrespondingFitnessFeatureShouldBeTrue() {
    org.corpus_tools.pepper.modules.PepperExporter module = org.mockito.Mockito.mock(org.corpus_tools.pepper.modules.PepperExporter.class);
    org.mockito.Mockito.when(module.getSupportedFormats()).thenReturn(java.util.Arrays.asList(new org.corpus_tools.pepper.common.FormatDesc().setFormatName("anyFormat").setFormatVersion("any Version")));
    org.assertj.core.api.Assertions.assertThat(new org.corpus_tools.pepper.core.ModuleFitnessChecker(null).checkFitness(module).getFitness(FitnessFeature.HAS_SUPPORTED_FORMATS)).isEqualTo(true);
}