public S wireTap(org.springframework.integration.dsl.channel.WireTapSpec wireTapSpec) {
    org.springframework.integration.channel.interceptor.WireTap interceptor = wireTapSpec.get();
    this.componentsToRegister.add(interceptor);
    return interceptor(interceptor);
}