boolean isNuevaSemana() {
    java.util.Calendar calendar = java.util.Calendar.getInstance();
    int semanaActual = calendar.get(java.util.Calendar.WEEK_OF_YEAR);
    calendar.add(java.util.Calendar.DAY_OF_YEAR, (-1));
    int semanaAyer = calendar.get(java.util.Calendar.WEEK_OF_YEAR);
    return semanaActual != semanaAyer;
}