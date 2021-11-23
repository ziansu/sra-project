@com.spontaneous.server.controller.RequestMapping(method = RequestMethod.PUT)
public com.spontaneous.server.model.response.BaseResponse updateEvent(@com.spontaneous.server.controller.RequestParam(value = "id")
long id, @com.spontaneous.server.controller.RequestBody
com.spontaneous.server.model.request.SaveEventRequest saveEventRequest) {
    try {
        mLogger.info(((("Update Event Request, for event with id #" + id) + ": ") + saveEventRequest));
        com.spontaneous.server.model.entity.Event event = mEventService.updateEvent(id, saveEventRequest);
        return new com.spontaneous.server.model.response.BaseResponse(event);
    } catch (org.hibernate.service.spi.ServiceException | java.io.IOException e) {
        return new com.spontaneous.server.model.response.BaseResponse(e.getMessage(), com.spontaneous.server.model.response.BaseResponse.INTERNAL_ERROR);
    }
}