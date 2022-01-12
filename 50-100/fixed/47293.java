@org.junit.Test
public void should_validate_file_input() throws java.lang.Exception {
    final org.bonitasoft.engine.core.process.definition.model.impl.SInputDefinitionImpl definition = new org.bonitasoft.engine.core.process.definition.model.impl.SInputDefinitionImpl("theFile", org.bonitasoft.engine.core.process.definition.model.SType.FILE, "description", false, java.util.Arrays.<org.bonitasoft.engine.core.process.definition.model.SInputDefinition>asList(new org.bonitasoft.engine.core.process.definition.model.impl.SInputDefinitionImpl("", "")));
    contractTypeValidator.validate(definition, new org.bonitasoft.engine.bpm.contract.FileInputValue("theFile", "", new byte[]{ 0 , 1 }), errorReporter);
    org.assertj.core.api.Assertions.assertThat(errorReporter.hasError()).isFalse();
}