public static void main(java.lang.String[] args) {
    kiuno.hibernate.HibernateDemo.mylogger = new kiuno.hibernate.MyLogger(kiuno.hibernate.HibernateDemo.class);
    kiuno.hibernate.HibernateDemo.log = kiuno.hibernate.HibernateDemo.mylogger.getLogger();
    org.hibernate.Session session = kiuno.hibernate.HibernateUtil.getSessionFactory().openSession();
    kiuno.hibernate.HibernateDemo.selectDataByHQL(session);
    session.close();
    java.lang.System.out.println("�s�W���OK!�Х���SQLite Browser�[�ݵ��G�I");
    kiuno.hibernate.HibernateUtil.shutdown();
}