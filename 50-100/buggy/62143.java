@java.lang.Override
public java.util.List<ar.edu.unrc.exa.dc.dose2016.riocuartobandasderock.model.Song> findByDuration(java.lang.Integer duration) {
    if ((duration != null) && (duration.equals(""))) {
        org.hibernate.query.Query<ar.edu.unrc.exa.dc.dose2016.riocuartobandasderock.model.Song> query = this.currentSession.createQuery("from Song where duration=:n", ar.edu.unrc.exa.dc.dose2016.riocuartobandasderock.model.Song.class);
        query.setParameter("n", duration);
        return query.getResultList();
    }else {
        throw new java.lang.IllegalArgumentException("the 'duration' param for search an song can not be null or empty.");
    }
}