@org.springframework.context.annotation.Bean
@org.springframework.context.annotation.Primary
@org.springframework.boot.context.properties.ConfigurationProperties(prefix = "spring.messaging")
public org.springframework.amqp.rabbit.connection.ConnectionFactory rabbitFactory() {
    new org.springframework.amqp.rabbit.connection.CachingConnectionFactory();
}