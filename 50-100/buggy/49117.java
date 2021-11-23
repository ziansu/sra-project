@ua.nc.controller.RequestMapping(value = { "/cesPost" }, method = RequestMethod.POST, produces = "application/json")
@ua.nc.controller.ResponseBody
public java.util.Set<ua.nc.controller.ValidationError> getCES(@ua.nc.controller.RequestBody
ua.nc.controller.CES ces) {
    ua.nc.controller.CESValidator cesValidator = new ua.nc.controller.CESValidator();
    java.util.Set<ua.nc.controller.ValidationError> errors = cesValidator.validate(ces);
    if (errors.isEmpty()) {
        try {
            cesService.setCES(ces);
        } catch (ua.nc.dao.exception.DAOException e) {
            e.printStackTrace();
        }
    }
    return errors;
}