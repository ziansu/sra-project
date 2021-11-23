@org.springframework.context.annotation.Bean
public com.datastax.driver.core.Session getSession() {
    final java.lang.String contactPoint = "127.0.0.1";
    return com.datastax.driver.core.Cluster.builder().addContactPoint(contactPoint).build().connect();
}