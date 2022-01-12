public java.lang.String execute(javax.servlet.http.HttpServletRequest request, by.pvt.predkel.serviceForDao.IFlammableSubstanceService flammableSubstanceService) {
    java.util.List<by.pvt.predkel.entities.FlammableSubstance> substances = null;
    try {
        substances = flammableSubstanceService.getAll();
    } catch (by.pvt.predkel.exceptions.ServiceException e) {
        MyLogger.INSTANCE.logError(getClass(), e.getMessage());
        request.setAttribute(Attributes.ERROR, Errors.DB_ERROR);
    }
    request.setAttribute(Attributes.ALL_SUBSTANCES, substances);
    return by.pvt.predkel.parameters.Path.CALCULATE_PATH;
}