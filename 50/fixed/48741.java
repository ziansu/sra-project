@java.lang.Override
public void run(final sampleDropwizard.SampleDropwizardConfiguration configuration, final io.dropwizard.setup.Environment environment) {
    sampleDropwizard.resources.SampleDropwizardResource sampleDropwizardResource = new sampleDropwizard.resources.SampleDropwizardResource();
    environment.jersey().register(sampleDropwizardResource);
}