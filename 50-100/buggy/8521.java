public se.plushogskolan.casemanagement.model.WorkItem save(se.plushogskolan.restcaseservice.model.DTOWorkItem dtoWorkItem) {
    se.plushogskolan.casemanagement.model.WorkItem workItem = dtoWorkItem.toEntity(dtoWorkItem);
    try {
        workItem = service.save(workItem);
    } catch (se.plushogskolan.casemanagement.exception.AlreadyPersistedException e) {
        throw new se.plushogskolan.restcaseservice.exception.ConflictException(e.getMessage());
    } catch (se.plushogskolan.casemanagement.exception.InternalErrorException e) {
        throw new se.plushogskolan.restcaseservice.exception.WebInternalErrorException(e.getMessage());
    }
    return workItem;
}