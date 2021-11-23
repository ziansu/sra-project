public java.util.List<br.com.caelum.agiletickets.models.Sessao> criaSessoes(org.joda.time.LocalDate inicio, org.joda.time.LocalDate fim, org.joda.time.LocalTime horario, br.com.caelum.agiletickets.models.Periodicidade periodicidade) {
    java.util.ArrayList<br.com.caelum.agiletickets.models.Sessao> lista = new java.util.ArrayList<br.com.caelum.agiletickets.models.Sessao>();
    int dias = org.joda.time.Days.daysBetween(inicio, fim).getDays();
    return lista;
}