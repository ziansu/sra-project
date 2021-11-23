public void waitForever() throws java.io.IOException {
    bundleContext.registerService(org.ops4j.pax.wicket.samples.plain.simple.service.EchoService.class, new org.ops4j.pax.wicket.it.samples.karaf.SampleWebUiTestFull.EchoServiceImplementation(), null);
    java.lang.System.in.read();
}