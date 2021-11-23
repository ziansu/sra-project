public boolean isAnswered(int id) throws co.edu.udea.iw.exception.ExceptionHandler {
    co.edu.udea.iw.dto.Solicitud solicitud = solicitudDAO.getById(id);
    if ((solicitud.getRespuesta().equals(null)) || (solicitud.getRespuesta().isEmpty())) {
        return false;
    }
    return true;
}