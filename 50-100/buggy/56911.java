@org.springframework.context.annotation.Bean
public javax.jms.Queue getJmsQueue(java.lang.String jndi) {
    javax.naming.Context jndiContext;
    javax.jms.Queue queue = null;
    try {
        jndiContext = new javax.naming.InitialContext();
        queue = ((javax.jms.Queue) (jndiContext.lookup(jndi)));
    } catch (javax.naming.NamingException e) {
        e.printStackTrace();
    }
    return queue;
}