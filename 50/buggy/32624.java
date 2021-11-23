@java.lang.Override
public org.gradle.internal.reflect.Instantiator injectAndDecorate(org.gradle.internal.service.ServiceRegistry registry) {
    return new org.gradle.api.internal.ClassGeneratorBackedInstantiator(classGenerator, new org.gradle.api.internal.DependencyInjectingInstantiator(registry, constructorCache));
}