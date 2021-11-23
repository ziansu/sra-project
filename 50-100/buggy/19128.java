@java.lang.Override
public void initialize(io.dropwizard.setup.Bootstrap<cloud.benchflow.driversmaker.configurations.DriversMakerConfiguration> bootstrap) {
    bootstrap.addBundle(new de.thomaskrille.dropwizard_template_config.TemplateConfigBundle());
    ru.vyarus.dropwizard.guice.GuiceBundle<cloud.benchflow.driversmaker.configurations.DriversMakerConfiguration> guiceBundle = ru.vyarus.dropwizard.guice.GuiceBundle.<cloud.benchflow.driversmaker.configurations.DriversMakerConfiguration>builder().enableAutoConfig("cloud.benchflow.driversmaker").modules(new cloud.benchflow.driversmaker.modules.BenchFlowEnvModule(), new cloud.benchflow.driversmaker.modules.BenchFlowConfigConverterModule()).build();
    bootstrap.addBundle(guiceBundle);
}