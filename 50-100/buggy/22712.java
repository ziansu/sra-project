public java.util.List<com.pluralsight.model.ProjectPim> findByProjectNumber(java.lang.String s) {
    java.util.List<com.pluralsight.model.ProjectPim> l = dummyData;
    java.util.List<com.pluralsight.model.ProjectPim> l2 = new java.util.ArrayList<com.pluralsight.model.ProjectPim>();
    java.lang.Long s2 = null;
    for (com.pluralsight.model.ProjectPim p : l) {
        try {
            s2 = java.lang.Long.parseLong(s, 10);
        } catch (java.lang.Exception e) {
            continue;
        }
        if (p.getPROJECT_NUMBER().equals(s2)) {
            l2.add(p);
        }
    }
    return l2;
}