@ua.nc.controller.RequestMapping(value = "/cessettings", method = RequestMethod.GET, produces = "application/json")
@ua.nc.controller.ResponseBody
public ua.nc.controller.CES ces() {
    try {
        cesService.checkRegistrationDate();
        cesService.checkInterviewDate();
        return cesService.getCurrentCES();
    } catch (ua.nc.dao.exception.DAOException e) {
        ua.nc.controller.AdminController.LOGGER.error("Can`t get CES");
        return null;
    }
}