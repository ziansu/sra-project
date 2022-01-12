@javax.jws.WebMethod
public pb138.service.dto.ItemDto changeItem(@javax.jws.WebParam(name = "ean")
long ean, @javax.jws.WebParam(name = "currentCount")
int currentCount, @javax.jws.WebParam(name = "unit")
java.lang.String unit, @javax.jws.WebParam(name = "alertThreshold")
java.lang.Integer alertThreshold) throws pb138.service.exceptions.EntityDoesNotExistException, pb138.service.exceptions.ServiceException {
    if ((alertThreshold != null) && (alertThreshold < 0)) {
        alertThreshold = null;
    }
    pb138.dal.entities.Item item = itemFacade.updateItemFromWeb(ean, currentCount, alertThreshold, unit);
    return automapper.mapTo(item, pb138.service.dto.ItemDto.class);
}