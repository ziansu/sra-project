public static void main(java.lang.String[] args) {
    org.springframework.context.support.ClassPathXmlApplicationContext context = new org.springframework.context.support.ClassPathXmlApplicationContext("classpath:rpc-config-client.xml");
    com.hrpc.test.service.HelloService service = ((com.hrpc.test.service.HelloService) (context.getBean("helloService")));
    java.lang.System.out.println(service.hello());
    context.destroy();
}