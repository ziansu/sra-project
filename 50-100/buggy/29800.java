public void setUp(java.lang.String name, java.lang.Class<?> cls) {
    context = new org.springframework.context.support.ClassPathXmlApplicationContext(name, cls);
    jdbcTemplate = new org.springframework.jdbc.core.JdbcTemplate(this.context.getBean("dataSource", javax.sql.DataSource.class));
    channel = this.context.getBean("target", org.springframework.messaging.MessageChannel.class);
    setupMessagingTemplate();
}