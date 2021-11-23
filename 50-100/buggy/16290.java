public static int getNextVakit(com.ezanvakti.db.model.Vakit v) {
    java.util.Date now = new java.util.Date();
    for (int i = 0; i < 6; ++i) {
        if (!(now.before(v.getVakit(i))))
            return i;
        
    }
    return -1;
}