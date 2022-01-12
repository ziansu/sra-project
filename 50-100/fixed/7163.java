@java.lang.Override
public java.lang.Boolean necesitaAutorizacion(java.lang.Integer idPractica, java.lang.Integer idPlan) throws ar.edu.ungs.commons.exception.BusinessException {
    try {
        ar.edu.ungs.persistence.entities.practica.CoberturaID id = new ar.edu.ungs.persistence.entities.practica.CoberturaID();
        id.setPlan(idPlan);
        id.setPractica(idPractica);
        ar.edu.ungs.persistence.entities.practica.Cobertura cobertura = coberturaDao.findById(id);
        if (cobertura != null)
            return cobertura.getRequiereAutorizacion();
        
        return false;
    } catch (ar.edu.ungs.commons.exception.DaoException e) {
        throw new ar.edu.ungs.commons.exception.BusinessException(e);
    }
}