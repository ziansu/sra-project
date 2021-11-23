private void setFechaPorCalendario(java.util.Calendar calendario) {
    int d = calendario.get(java.util.Calendar.DAY_OF_MONTH);
    int m = (calendario.get(java.util.Calendar.MONTH)) + 1;
    int y = calendario.get(java.util.Calendar.YEAR);
    Model.Fecha newFecha = new Model.Fecha(d, m, y);
    setFf(newFecha);
}