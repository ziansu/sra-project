public void saveCreditcard() {
    try {
        utx.begin();
        if ((user.getKreditkarte()) == null)
            user.setKreditkarte(tmpKreditkarte);
        
        em.merge(user);
        utx.commit();
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}