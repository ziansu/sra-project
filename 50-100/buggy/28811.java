@softgroup.ua.rest.RequestMapping(path = "/automats/byId/{automatId}/play", method = RequestMethod.GET, produces = org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE)
public softgroup.ua.api.AutomatsListReply getGameResult(@softgroup.ua.rest.PathVariable
java.lang.Integer automatId) {
    softgroup.ua.api.AutomatsListReply reply = new softgroup.ua.api.AutomatsListReply();
    try {
        softgroup.ua.api.Automat automat = automatMapper.fromInternal(automatService.getAutomatById(automatId));
        reply.automats.add(gameEngine.play(automat));
    } catch (softgroup.ua.service.exception.ParsingException e) {
        e.printStackTrace();
        softgroup.ua.rest.AutomatController.logger.error(e.toString(), e);
    }
    return reply;
}