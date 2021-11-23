public static int getCurrentVakit(com.ezanvakti.db.model.Vakit v) {
    java.util.Date now = new java.util.Date();
    for (int i = 5; i >= 0; --i) {
        if (!(now.before(v.getVakit(i))))
            return i + 1;
        
    }
    return 5;
}