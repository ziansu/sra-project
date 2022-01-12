@java.lang.Override
public java.lang.Object action() {
    java.lang.Object object = r.action(id, endpointClazz, customActionKey, requestJson, params);
    if (object == null) {
        return new io.yawp.commons.http.JsonResponse("");
    }
    applyGetFacade(object);
    if (hasTransformer()) {
        return transform(object);
    }
    return object;
}