public static <T extends principal.TieneFecha> java.util.Collection<T> filtrar(java.util.Collection<T> dat, java.util.Calendar inicio, java.util.Calendar fin) {
    java.util.Collection<T> ret = new java.util.ArrayList<T>();
    if (dat == null)
        return ret;
    
    for (T e : dat) {
        if ((e.getFecha().after(inicio)) && (e.getFecha().before(fin))) {
            ret.add(e);
        }
    }
    return ret;
}