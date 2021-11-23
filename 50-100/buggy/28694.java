protected void collectDefinedParameterNames() {
    listParameterNames = new java.util.ArrayList<>();
    ro.teodorbaciu.commons.ws.ServiceParameter[] parameters = ro.teodorbaciu.commons.ws.ServiceOperation.class.getAnnotationsByType(ro.teodorbaciu.commons.ws.ServiceParameter.class);
    for (ro.teodorbaciu.commons.ws.ServiceParameter parameter : parameters) {
        listParameterNames.add(parameter.name());
    }
}