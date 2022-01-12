@org.w2fc.geoportal.ws.aspect.AfterReturning(pointcut = "execution(* org.w2fc.geoportal.ws.GeoObjectService.delete(..)))", returning = "result")
public void afterDeleteSuccess(org.aspectj.lang.JoinPoint joinPoint, java.lang.Object result) {
    java.lang.Long guid = ((java.lang.Long) (joinPoint.getArgs()[0]));
    java.lang.Long layerId = getLayerId(guid);
    org.w2fc.geoportal.domain.OperationStatus actionStatus = new org.w2fc.geoportal.domain.OperationStatus(guid.toString(), getPid(), getCurrentUserId(), OperationStatus.Action.DELETE, OperationStatus.Status.SUCCESS, new java.util.Date(), layerId);
    repository.save(actionStatus);
}