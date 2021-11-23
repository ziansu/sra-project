@org.w2fc.geoportal.ws.aspect.After(value = "execution(* org.w2fc.geoportal.ws.GeoObjectService.createAndSaveObject(org.w2fc.geoportal.ws.model.RequestGeoObject)))")
public void aroundCreateSoapSuccess(org.aspectj.lang.JoinPoint joinPoint) {
    org.w2fc.geoportal.ws.model.RequestGeoObject requestGeoObject = ((org.w2fc.geoportal.ws.model.RequestGeoObject) (joinPoint.getArgs()[0]));
    org.w2fc.geoportal.domain.OperationStatus actionStatus = new org.w2fc.geoportal.domain.OperationStatus(requestGeoObject.getGuid(), getPid(), getCurrentUserId(), OperationStatus.Action.CREATE, OperationStatus.Status.SUCCESS, new java.util.Date(), requestGeoObject.getLayerId());
    repository.save(actionStatus);
}