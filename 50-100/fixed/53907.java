public java.util.List<java.lang.Object[]> getDvObjectInfoForMyData(java.util.List<java.lang.Long> dvObjectIdList) {
    java.lang.String dvObjectClause = getDvObjectIdListClause(dvObjectIdList);
    if (dvObjectClause == null) {
        return null;
    }
    java.lang.String qstr = "SELECT dv.id, dv.dtype, dv.owner_id";
    qstr += " FROM dvobject dv";
    qstr += " WHERE  dv.id IN " + dvObjectClause;
    qstr += ";";
    return em.createNativeQuery(qstr).getResultList();
}