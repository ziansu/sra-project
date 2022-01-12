@org.junit.Test
public void shouldProvideConfigOptionsForURIAndParameterName() {
    java.util.Collection<org.eclipse.smarthome.config.core.ParameterOption> parameterOptions = magicService.getParameterOptions(MagicService.CONFIG_URI, org.eclipse.smarthome.magic.binding.internal.MagicServiceImplTest.PARAMETER_NAME, null);
    assertThat(parameterOptions, org.hamcrest.collection.IsCollectionWithSize.hasSize(3));
}