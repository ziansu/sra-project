@org.junit.Before
public void setup() {
    bind(org.jboss.arquillian.core.api.annotation.ApplicationScoped.class, org.arquillian.cube.docker.impl.util.Boot2Docker.class, new org.arquillian.cube.docker.impl.util.Boot2Docker(commandLineExecutor));
    bind(org.jboss.arquillian.core.api.annotation.ApplicationScoped.class, org.arquillian.cube.docker.impl.util.DockerMachine.class, new org.arquillian.cube.docker.impl.util.DockerMachine(commandLineExecutor));
    bind(org.jboss.arquillian.core.api.annotation.ApplicationScoped.class, org.jboss.arquillian.config.descriptor.api.ArquillianDescriptor.class, arquillianDescriptor);
    bind(org.jboss.arquillian.core.api.annotation.ApplicationScoped.class, org.arquillian.cube.docker.impl.util.Top.class, top);
    org.mockito.Mockito.when(top.isSpinning()).thenReturn(false);
}