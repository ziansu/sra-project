@org.springframework.web.bind.annotation.RequestMapping(value = "/count", method = org.springframework.web.bind.annotation.RequestMethod.GET, produces = { "application/json" })
@org.springframework.web.bind.annotation.ResponseStatus(value = org.springframework.http.HttpStatus.OK)
public com.pm.server.response.PacdotCountResponse getPacdotCount(javax.servlet.http.HttpServletResponse response) {
    com.pm.server.controller.PacdotController.log.info("Mapped GET /pacdots/count");
    com.pm.server.response.PacdotCountResponse countResponse = new com.pm.server.response.PacdotCountResponse();
    java.util.List<com.pm.server.datatype.Pacdot> pacdotList = pacdotRegistry.getAllPacdots();
    for (com.pm.server.datatype.Pacdot pacdot : pacdotList) {
        countResponse.incrementTotal();
        if (pacdot.getEaten()) {
            countResponse.incrementEaten();
        }else {
            countResponse.incrementUneaten();
            if (pacdot.getPowerdot()) {
                countResponse.incrementUneatenPowerdots();
            }
        }
    }
    return countResponse;
}