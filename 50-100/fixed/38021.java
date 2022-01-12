public java.util.Map<java.lang.String, java.lang.String> getSkupinaList() {
    skupinaList = new java.util.LinkedHashMap<java.lang.String, java.lang.String>();
    java.util.List<org.fit.pis.back.Skupina> skupiny = ridicskyPrukazSkupinaMgr.findAllSkupina();
    for (java.util.ListIterator<org.fit.pis.back.Skupina> iter = skupiny.listIterator(); iter.hasNext();) {
        org.fit.pis.back.Skupina s = iter.next();
        skupinaList.put(s.getOznaceni(), java.lang.Integer.toString(s.getId()));
    }
    return skupinaList;
}