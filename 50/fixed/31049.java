@ua.nc.controller.RequestMapping(value = "/cessettings", method = RequestMethod.GET, produces = "application/json")
@ua.nc.controller.ResponseBody
public ua.nc.controller.CES ces() {
    cesService.checkRegistrationDate();
    cesService.checkInterviewDate();
    return cesService.getCurrentCES();
}