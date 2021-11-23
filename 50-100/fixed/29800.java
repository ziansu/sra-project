public void setUp(java.lang.String name, java.lang.Class<?> cls) {
    this.context = new org.springframework.context.support.ClassPathXmlApplicationContext(name, cls);
    this.jdbcTemplate = new org.springframework.jdbc.core.JdbcTemplate(this.context.getBean("dataSource", javax.sql.DataSource.class));
    this.channel = this.context.getBean("target", org.springframework.messaging.MessageChannel.class);
    setupMessagingTemplate();
}