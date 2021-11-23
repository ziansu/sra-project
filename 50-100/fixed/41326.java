private boolean validarFechas(java.util.Date f_inicio, java.util.Date f_final) {
    if ((f_inicio != null) && (f_final != null)) {
        int dateValue = f_inicio.compareTo(f_final);
        if (dateValue <= 0) {
            return true;
        }
    }
    return false;
}