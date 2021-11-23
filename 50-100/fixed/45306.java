private ar.edu.ungs.persistence.entities.autorizaciones.Autorizacion guardarAutorizacion(ar.edu.ungs.business.dto.AutorizacionDTO autorizacionDto, ar.edu.ungs.persistence.entities.autorizaciones.TipoAutorizacion.TipoAutorizacionEnum tipo) throws ar.edu.ungs.commons.exception.BusinessException {
    try {
        ar.edu.ungs.persistence.entities.autorizaciones.Autorizacion autorizacion = new ar.edu.ungs.persistence.entities.autorizaciones.Autorizacion();
        autorizacion.setFecha(autorizacionDto.getFecha());
        autorizacion.setProfesional(autorizacionDto.getProfesional());
        autorizacion.setTipoAutorizacion(tipoAutorizacionDao.findById(tipo.getValue()));
        return autorizacionDao.persist(autorizacion);
    } catch (ar.edu.ungs.commons.exception.DaoException e) {
        throw new ar.edu.ungs.commons.exception.BusinessException(e);
    }
}