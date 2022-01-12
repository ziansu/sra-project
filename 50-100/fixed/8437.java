@java.lang.Override
public java.util.List<dtu.cdio_final.shared.dto.MaterialDTO> getMaterials(java.lang.String token) throws dtu.cdio_final.shared.ServiceException, dtu.cdio_final.shared.TokenException {
    validateToken(token);
    java.util.List<dtu.cdio_final.shared.dto.MaterialDTO> result;
    try {
        result = materialDao.getMaterialList();
    } catch (dtu.cdio_final.server.dal.daointerfaces.DALException e) {
        throw new dtu.cdio_final.shared.ServiceException(e);
    }
    return result;
}