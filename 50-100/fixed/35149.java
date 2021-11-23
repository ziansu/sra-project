public static void findWeight() {
    java.lang.String openid = session.get("openid");
    java.lang.String sql = ("select new beans.PregwBean(w.wDate,w.wValue) from GestationalWeight w where  w.userId = '" + openid) + "' order by w.wDate desc";
    java.util.List<beans.PregwBean> bean = play.db.jpa.JPA.em().createQuery(sql).setMaxResults(7).getResultList();
    wsOk(bean);
}