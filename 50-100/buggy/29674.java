@org.apache.zeppelin.rest.POST
@org.apache.zeppelin.rest.Path(value = "order/visualization")
public javax.ws.rs.core.Response setVisualizationPackageOrder(java.lang.String orderedPackageNameList) {
    java.util.List<java.lang.String> orderedList = gson.fromJson(orderedPackageNameList, new com.google.gson.reflect.TypeToken<java.util.List<java.lang.String>>() {    }.getType());
    try {
        helium.setVisualizationPackageOrder(orderedList);
    } catch (java.io.IOException e) {
        logger.error(e.getMessage(), e);
        return new org.apache.zeppelin.server.JsonResponse(Response.Status.INTERNAL_SERVER_ERROR, e.getMessage()).build();
    }
    return new org.apache.zeppelin.server.JsonResponse(Response.Status.OK).build();
}