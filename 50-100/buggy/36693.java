@org.jbehave.core.annotations.Then(value = "stop microservice $microservice")
public void stopMicroservice(java.lang.String microservice) throws java.lang.Throwable {
    if (microserviceMap.containsKey(microservice)) {
        java.lang.Object microserviceInstance = microserviceMap.get(microservice);
        java.lang.Class<?> microserviceClass = getClass().getClassLoader().loadClass(resolveClass(microservice));
        java.lang.reflect.Method stopMethod = microserviceClass.getMethod("stop");
        stopMethod.invoke(microserviceInstance);
    }
}