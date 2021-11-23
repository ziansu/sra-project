@se.travappar.api.controller.RequestMapping(value = "/{deviceId}", method = RequestMethod.GET)
@se.travappar.api.controller.ResponseBody
public se.travappar.api.model.Users getUser(@se.travappar.api.controller.PathVariable
long deviceId) {
    se.travappar.api.controller.UsersController.logger.info(("Getting user executed on / with id=" + deviceId));
    return userDAO.get(deviceId);
}