@org.springframework.context.annotation.Bean
public com.queen.counter.service.Populator populator() {
    com.queen.counter.service.Populator populator = new com.queen.counter.service.Populator(configureClocks(), seconds, minutes, hours);
    return populator;
}