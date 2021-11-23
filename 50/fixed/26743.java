@org.springframework.context.annotation.Bean
public com.netflix.loadbalancer.IRule ribbonRule() {
    return new com.netflix.loadbalancer.RoundRobinRule();
}