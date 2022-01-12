private nl.b3p.gis.viewer.db.Themas getTekenTabGekozenKaartlaag(java.lang.String appCode, org.hibernate.Session sess) throws java.lang.Exception {
    nl.b3p.gis.utils.ConfigKeeper configKeeper = new nl.b3p.gis.utils.ConfigKeeper();
    java.util.Map map = configKeeper.getConfigMap(appCode, true);
    nl.b3p.gis.viewer.db.Themas gekozenKaartlaag = null;
    java.lang.Integer laagId = ((java.lang.Integer) (map.get("tekenKaartlaagId")));
    if ((laagId != null) && (laagId > 0)) {
        gekozenKaartlaag = ((nl.b3p.gis.viewer.db.Themas) (sess.get(nl.b3p.gis.viewer.db.Themas.class, laagId)));
    }
    return gekozenKaartlaag;
}