@org.springframework.web.bind.annotation.RequestMapping(value = "", method = org.springframework.web.bind.annotation.RequestMethod.GET, produces = { "application/json" })
@org.springframework.web.bind.annotation.ResponseStatus(value = org.springframework.http.HttpStatus.OK)
public com.pm.server.datatype.GameStateContainer resetPacdots(javax.servlet.http.HttpServletResponse response) {
    com.pm.server.controller.AdminGameStateController.log.info("Mapped GET /admin/gamestate");
    com.pm.server.datatype.GameStateContainer stateContainer = new com.pm.server.datatype.GameStateContainer();
    stateContainer.setState(gameStateRegistry.getCurrentState());
    return stateContainer;
}