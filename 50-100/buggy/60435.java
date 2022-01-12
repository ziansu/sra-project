@java.lang.Override
public java.lang.String toJson(java.util.Set<javax.websocket.Session> objs) throws org.ocelotds.marshalling.exceptions.JsonMarshallingException {
    java.lang.StringBuilder result = new java.lang.StringBuilder("[");
    boolean first = true;
    for (javax.websocket.Session obj : objs) {
        if (!first) {
            result.append(",");
        }
        result.append((("\"" + (obj.getId())) + "\""));
    }
    result.append("]");
    return result.toString();
}