private boolean contains(java.util.List<fr.imag.entities.OrderLine> list, int idProduct) {
    for (fr.imag.entities.OrderLine order : list) {
        fr.imag.entities.Movie m = em.find(fr.imag.entities.Movie.class, order.getIdProduct());
        if (idProduct == (m.getIdTMDB())) {
            return true;
        }
    }
    return false;
}