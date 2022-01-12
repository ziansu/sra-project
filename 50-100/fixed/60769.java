@java.lang.Deprecated
public static java.util.List<br.edu.utfpr.biblioteca.salas.model.ReservasHorario> getReservasHorario(br.edu.utfpr.biblioteca.salas.model.entity.SalaPO sala) {
    br.edu.utfpr.biblioteca.salas.model.entity.SalaPO salaPO = br.edu.utfpr.biblioteca.salas.model.bo.SalaBO.obter(sala.getId());
    java.util.List<br.edu.utfpr.biblioteca.salas.model.ReservasHorario> reservasHorario = new java.util.ArrayList();
    br.edu.utfpr.biblioteca.salas.model.ReservasHorario rH = new br.edu.utfpr.biblioteca.salas.model.ReservasHorario();
    reservasHorario.add(rH);
    return reservasHorario;
}