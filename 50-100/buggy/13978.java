@org.w2fc.geoportal.ws.aspect.After(value = "execution(* org.w2fc.geoportal.ws.GeoObjectService.updateObject(Long, org.w2fc.geoportal.ws.model.GeometryParameter)))")
public void aroundUpdateRestSuccess(org.aspectj.lang.JoinPoint joinPoint) {
    org.w2fc.geoportal.ws.model.GeometryParameter requestGeoObject = ((org.w2fc.geoportal.ws.model.GeometryParameter) (joinPoint.getArgs()[1]));
    org.w2fc.geoportal.domain.OperationStatus actionStatus = new org.w2fc.geoportal.domain.OperationStatus(requestGeoObject.getGuid(), getPid(), getCurrentUserId(), OperationStatus.Action.UPDATE, OperationStatus.Status.SUCCESS, new java.util.Date(), requestGeoObject.getLayerId());
    repository.save(actionStatus);
}