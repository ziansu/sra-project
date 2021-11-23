@org.junit.Before
public void beforeEachTest() throws java.lang.Exception {
    executeDataSet("org/openmrs/module/idgen/include/TestData.xml");
    iss = new org.openmrs.module.idgen.service.IdentifierSourceServiceTest.BaseIdentifierSourceServiceStub();
    iss.setDao(dao);
    org.openmrs.module.idgen.processor.SequentialIdentifierGeneratorProcessor processor = new org.openmrs.module.idgen.processor.SequentialIdentifierGeneratorProcessor();
    processor.setIdentifierSourceService(iss);
    java.util.Map<java.lang.Class<? extends org.openmrs.module.idgen.IdentifierSource>, org.openmrs.module.idgen.processor.IdentifierSourceProcessor> processors = new java.util.HashMap<java.lang.Class<? extends org.openmrs.module.idgen.IdentifierSource>, org.openmrs.module.idgen.processor.IdentifierSourceProcessor>();
    processors.put(org.openmrs.module.idgen.SequentialIdentifierGenerator.class, processor);
    iss.setProcessors(processors);
}