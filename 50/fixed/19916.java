@org.junit.Before
public void setup() {
    source = org.mockito.Mockito.mock(java.lang.ClassLoader.class);
    service = new org.kie.workbench.common.forms.jbpm.server.service.formGeneration.impl.runtime.BPMNRuntimeFormGeneratorService(fieldManager, new org.kie.soup.project.datamodel.commons.util.RawMVELEvaluator());
}