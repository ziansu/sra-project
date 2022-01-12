private java.lang.String getDiaSemana(int diaSemana) {
    java.lang.String dia = "";
    switch (diaSemana) {
        case java.util.Calendar.MONDAY :
            dia = "Lunes";
            break;
        case java.util.Calendar.TUESDAY :
            dia = "Martes";
            break;
        case java.util.Calendar.WEDNESDAY :
            dia = "Miercoles";
            break;
        case java.util.Calendar.THURSDAY :
            dia = "Jueves";
            break;
        case java.util.Calendar.FRIDAY :
            dia = "Viernes";
            break;
        case java.util.Calendar.SATURDAY :
            dia = "Sabado";
            break;
        default :
            dia = "Domingo";
            break;
    }
    return dia;
}