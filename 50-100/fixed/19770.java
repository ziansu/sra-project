@com.app.mvc.controller.RequestMapping(value = "/events/{id}", method = RequestMethod.GET)
public org.springframework.http.ResponseEntity<com.app.mvc.controller.response.Response> retrieve(@com.app.mvc.controller.PathVariable
int id) {
    com.app.mvc.controller.response.ResponseData data;
    try {
        data = eventService.get(id);
    } catch (com.app.mvc.service.exception.NotFoundException e) {
        return com.app.mvc.controller.response.ResponseFactory.badRequest(ResponseFactory.EVENT_NOT_FOUND);
    }
    return com.app.mvc.controller.response.ResponseFactory.ok(data);
}