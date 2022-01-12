@java.lang.Override
public void initialize(io.dropwizard.setup.Bootstrap<io.dropwizard.example.JobsApplicationConfiguration> bootstrap) {
    com.hubspot.dropwizard.guice.GuiceBundle<io.dropwizard.example.JobsApplicationConfiguration> guiceBundle = com.hubspot.dropwizard.guice.GuiceBundle.<io.dropwizard.example.JobsApplicationConfiguration>newBuilder().addModule(new io.dropwizard.example.JobsApplicationModule()).setConfigClass(io.dropwizard.example.JobsApplicationConfiguration.class).build();
    bootstrap.addBundle(guiceBundle);
    bootstrap.addBundle(new de.spinscale.dropwizard.jobs.GuiceJobsBundle(guiceBundle.getInjector().getParent()));
}