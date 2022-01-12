public static org.hibernate.SessionFactory getSessionFactory() {
    if ((fr.gemeroi.persistence.session.SessionMgr.factory) == null) {
        fr.gemeroi.persistence.session.SessionMgr.factory = new org.hibernate.cfg.AnnotationConfiguration().configure().addPackage("fr.gemeroi.population.persistence.bean.generated").addAnnotatedClass(fr.gemeroi.persistence.bean.Entityvideo.class).addAnnotatedClass(fr.gemeroi.persistence.bean.Subtitle.class).addAnnotatedClass(fr.gemeroi.persistence.bean.User.class).addAnnotatedClass(fr.gemeroi.persistence.bean.UsersTranslations.class).buildSessionFactory();
    }
    return fr.gemeroi.persistence.session.SessionMgr.factory;
}