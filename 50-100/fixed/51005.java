@org.junit.Test
public void appSensorRepositoryTest() {
    final de.uka.ipd.sdq.beagle.core.pcmconnection.PcmRepositoryBlackboardFactoryAdder appSensorBlackboardFactory = de.uka.ipd.sdq.beagle.core.pcmconnection.PcmRepositoryBlackboardFactoryTest.pcmRepositoryBlackboardFactoryFactory.getAppSensorProjectInstance();
    final de.uka.ipd.sdq.beagle.core.BlackboardCreator blackboardCreator = new de.uka.ipd.sdq.beagle.core.BlackboardCreator();
    appSensorBlackboardFactory.getBlackboardForAllElements(blackboardCreator);
    blackboardCreator.setFitnessFunction(org.mockito.Mockito.mock(de.uka.ipd.sdq.beagle.core.judge.EvaluableExpressionFitnessFunction.class));
    blackboardCreator.setProjectInformation(org.mockito.Mockito.mock(de.uka.ipd.sdq.beagle.core.ProjectInformation.class));
    blackboardCreator.createBlackboard();
}