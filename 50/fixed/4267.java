@org.springframework.context.annotation.Bean
public com.datastax.driver.core.Session getSession() {
    return com.datastax.driver.core.Cluster.builder().addContactPoint(contactPoint).build().connect();
}