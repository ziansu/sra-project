public org.smartbirdpj.mdl.Point getPoint(java.util.Map<java.lang.Integer, java.util.Map<java.lang.Integer, org.smartbirdpj.mdl.Point>> map, int han, int hu) {
    org.smartbirdpj.mdl.Point rv = null;
    if (han >= (org.smartbirdpj.engine.controller.PointHolder.HAN_MAX)) {
        han = org.smartbirdpj.engine.controller.PointHolder.HAN_MAX;
        hu = org.smartbirdpj.engine.controller.PointHolder.HU_MAX;
    }
    try {
        rv = map.get(han).get(hu);
    } catch (java.lang.NullPointerException e) {
        rv = null;
    }
    rv.setHan(han);
    rv.setHu(hu);
    return rv;
}