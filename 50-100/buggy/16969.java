public void creaVaixell(java.lang.String nom, int anys, entitats.Pescador capita) {
    entitats.Vaixell vai = new entitats.Vaixell(nom, anys);
    vai.set4_capita(capita);
    try {
        vaixell.guarda(vai);
    } catch (org.hibernate.HibernateException e) {
        tractaExcepcio(e);
    }
    actualitzaLlistes();
}