private javax.sql.DataSource getDataSource() {
    org.springframework.context.ApplicationContext ctx = new org.springframework.context.support.ClassPathXmlApplicationContext("WEB-INF/spring-database.xml");
    return ((javax.sql.DataSource) (ctx.getBean("dataSource")));
}