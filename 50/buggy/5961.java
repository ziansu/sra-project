public static void setKieContainer(org.kie.api.runtime.KieContainer kieContainer) {
    com.secbro.drools.utils.KieUtils.kieContainer = kieContainer;
    com.secbro.drools.utils.KieUtils.kieSession = kieContainer.newKieSession();
}