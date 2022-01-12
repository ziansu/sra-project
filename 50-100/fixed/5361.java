public void saveCreditcard() {
    try {
        utx.begin();
        user.setKreditkarte(tmpKreditkarte);
        user = em.merge(user);
        tmpKreditkarte = user.getKreditkarte();
        utx.commit();
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}