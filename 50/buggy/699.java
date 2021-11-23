@org.junit.Before
public void setup() throws java.lang.Exception {
    super.setup();
    javaExperiment = new de.tudarmstadt.ukp.dkpro.tc.examples.report.NewTcEvaluationReportDemo();
    pSpace = de.tudarmstadt.ukp.dkpro.tc.examples.single.document.ComplexConfigurationSingleDemo.getParameterSpace();
}