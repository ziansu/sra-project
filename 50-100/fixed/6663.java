public static void loadAllWeight() {
    java.lang.String openid = session.get("openid");
    java.lang.String sql = ("select new beans.PregwBean(w.wDate,w.wValue) from GestationalWeight w where  w.userId = '" + openid) + "' order by w.wDate desc";
    java.util.List<beans.PregwBean> bean = play.db.jpa.JPA.em().createQuery(sql).getResultList();
    wsOk(bean);
}