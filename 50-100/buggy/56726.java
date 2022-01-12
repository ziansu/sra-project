@org.junit.Test
public void shouldDisposeOnStop() {
    cucumber.api.java.ObjectFactory factory = new cucumber.runtime.java.picocontainer.PicoFactory();
    factory.addClass(cucumber.runtime.java.picocontainer.StepDefs.class);
    factory.start();
    cucumber.runtime.java.picocontainer.StepDefs steps = factory.getInstance(cucumber.runtime.java.picocontainer.StepDefs.class);
    org.junit.Assert.assertFalse(steps.getBelly().isDisposed());
    factory.stop();
    org.junit.Assert.assertTrue(steps.getBelly().isDisposed());
}