public static org.hibernate.SessionFactory getSessionFactory() {
    fr.gemeroi.persistence.session.SessionMgr.factory = new org.hibernate.cfg.AnnotationConfiguration().configure().addAnnotatedClass(fr.gemeroi.persistence.bean.Entityvideo.class).addAnnotatedClass(fr.gemeroi.persistence.bean.Subtitle.class).addAnnotatedClass(fr.gemeroi.persistence.bean.User.class).addAnnotatedClass(fr.gemeroi.persistence.bean.UsersTranslations.class).buildSessionFactory();
    return fr.gemeroi.persistence.session.SessionMgr.factory;
}