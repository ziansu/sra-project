java.lang.Object[] whereValues() {
    java.util.List<java.lang.Object> ret = new java.util.LinkedList<java.lang.Object>();
    for (jazmin.driver.jdbc.QueryTerms.Where w : wheres) {
        if ((w.key) != null) {
            ret.add(w.value);
        }else {
            ret.addAll(w.sqlValues);
        }
    }
    return ret.toArray();
}