@org.springframework.transaction.annotation.Transactional
public void enviaAvisoNuevaReunion(es.uji.apps.goc.dto.Reunion reunion) throws es.uji.apps.goc.exceptions.MiembrosExternosException, es.uji.apps.goc.exceptions.NotificacionesException, es.uji.apps.goc.exceptions.ReunionNoDisponibleException {
    java.util.List<java.lang.String> miembros = getMiembros(reunion, false);
    es.uji.apps.goc.notifications.Mensaje mensaje = new es.uji.apps.goc.notifications.Mensaje();
    mensaje.setAsunto("[GOC] Nueva reunión: Se te ha incluido como miembro en una nueva convocatoria de reunión");
    mensaje.setContentType("text/html");
    es.uji.apps.goc.notifications.ReunionFormatter formatter = new es.uji.apps.goc.notifications.ReunionFormatter(reunion);
    mensaje.setCuerpo(formatter.format());
    mensaje.setReplyTo(reunion.getCreadorEmail());
    mensaje.setDestinos(miembros);
    notificacionesDAO.enviaNotificacion(mensaje);
}