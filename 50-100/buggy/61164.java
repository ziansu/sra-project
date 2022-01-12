@org.w2fc.geoportal.ws.aspect.AfterReturning(pointcut = "execution(* org.w2fc.geoportal.ws.GeoObjectService.delete(Long)))", returning = "result")
public void afterDeleteRestSuccess(org.aspectj.lang.JoinPoint joinPoint, java.lang.Object result) {
    java.lang.Long id = ((java.lang.Long) (joinPoint.getArgs()[0]));
    java.util.Set<java.lang.Long> layerIds = getLayerIds(id);
    org.w2fc.geoportal.domain.OperationStatus actionStatus = new org.w2fc.geoportal.domain.OperationStatus(id.toString(), getPid(), getCurrentUserId(), OperationStatus.Action.DELETE, OperationStatus.Status.SUCCESS, new java.util.Date(), layerIds.toString());
    repository.save(actionStatus);
}