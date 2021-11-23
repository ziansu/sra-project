private int getDiaSemana(java.lang.String diaSemana) {
    int dia = 0;
    switch (diaSemana) {
        case "Lunes" :
            dia = java.util.Calendar.MONDAY;
            break;
        case "Martes" :
            dia = java.util.Calendar.TUESDAY;
            break;
        case "Miercoles" :
            dia = java.util.Calendar.WEDNESDAY;
            break;
        case "Jueves" :
            dia = java.util.Calendar.THURSDAY;
            break;
        case "Viernes" :
            dia = java.util.Calendar.FRIDAY;
            break;
        case "Sabado" :
            dia = java.util.Calendar.SATURDAY;
            break;
        default :
            dia = java.util.Calendar.SATURDAY;
            break;
    }
    return dia;
}