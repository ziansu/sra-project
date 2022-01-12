@org.springframework.beans.factory.annotation.Autowired
@org.springframework.context.annotation.Bean(name = "sessionFactory")
public org.hibernate.SessionFactory getSessionFactory(javax.sql.DataSource dataSource) {
    org.springframework.orm.hibernate4.LocalSessionFactoryBuilder sessionBuilder = new org.springframework.orm.hibernate4.LocalSessionFactoryBuilder(dataSource);
    sessionBuilder.addAnnotatedClasses(com.rpglife.configuration.Board.class, com.rpglife.configuration.Task.class, com.rpglife.configuration.Achievement.class, com.rpglife.configuration.Award.class, com.rpglife.configuration.Category.class, com.rpglife.configuration.Level.class, com.rpglife.configuration.Member.class, com.rpglife.configuration.Achievement.class, com.rpglife.configuration.MemberAward.class);
    sessionBuilder.addProperties(getHibernateProperties());
    return sessionBuilder.buildSessionFactory();
}