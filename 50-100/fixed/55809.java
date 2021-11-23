@org.junit.BeforeClass
public static void setUp() throws org.pentaho.di.core.exception.KettleException {
    org.pentaho.di.trans.steps.csvinput.CsvInputUnicodeTest.stepMockHelper = new org.pentaho.di.trans.steps.mock.StepMockHelper<org.pentaho.di.trans.steps.csvinput.CsvInputMeta, org.pentaho.di.trans.steps.csvinput.CsvInputData>("CsvInputTest", org.pentaho.di.trans.steps.csvinput.CsvInputMeta.class, org.pentaho.di.trans.steps.csvinput.CsvInputData.class);
    org.mockito.Mockito.when(org.pentaho.di.trans.steps.csvinput.CsvInputUnicodeTest.stepMockHelper.logChannelInterfaceFactory.create(org.mockito.Matchers.any(), org.mockito.Matchers.any(org.pentaho.di.core.logging.LoggingObjectInterface.class))).thenReturn(org.pentaho.di.trans.steps.csvinput.CsvInputUnicodeTest.stepMockHelper.logChannelInterface);
    org.mockito.Mockito.when(org.pentaho.di.trans.steps.csvinput.CsvInputUnicodeTest.stepMockHelper.trans.isRunning()).thenReturn(true);
}