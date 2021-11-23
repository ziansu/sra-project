@org.junit.Test
public void shouldGiveUsNewInstancesForEachScenario() {
    factory.addClass(cucumber.runtime.java.picocontainer.StepDefs.class);
    factory.start();
    cucumber.runtime.java.picocontainer.StepDefs o1 = factory.getInstance(cucumber.runtime.java.picocontainer.StepDefs.class);
    factory.stop();
    factory.start();
    cucumber.runtime.java.picocontainer.StepDefs o2 = factory.getInstance(cucumber.runtime.java.picocontainer.StepDefs.class);
    factory.stop();
    org.junit.Assert.assertNotNull(o1);
    org.junit.Assert.assertNotSame(o1, o2);
}