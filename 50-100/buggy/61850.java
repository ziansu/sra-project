private java.lang.Object[] updateArgs(long id, java.util.Map m) {
    java.util.List largs = new java.util.ArrayList();
    for (java.util.Map.Entry<java.lang.String, ca.weblite.codename1.db.DAO.ColType> e : colTypes.entrySet()) {
        largs.add(("" + (m.get(e.getKey()))));
    }
    largs.add(id);
    return largs.toArray(new java.lang.Object[0]);
}