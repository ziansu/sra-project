private boolean contains(java.util.List<fr.imag.entities.OrderLine> list, int idProduct) {
    for (fr.imag.entities.OrderLine order : list) {
        fr.imag.entities.Movie m = em.find(fr.imag.entities.Movie.class, java.lang.Integer.parseInt(order.getIdProduct()));
        if (idProduct == (m.getIdTMDB())) {
            return true;
        }
    }
    return false;
}