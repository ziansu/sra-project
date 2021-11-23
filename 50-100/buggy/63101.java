private java.lang.String parseToken(org.springframework.messaging.MessageHeaders headers) {
    java.lang.System.out.println("---- Headers ----");
    java.lang.System.out.println(headers.toString());
    java.lang.Object headersObj = headers.get("nativeHeaders");
    if (headersObj != null) {
        com.fasterxml.jackson.databind.ObjectMapper m = new com.fasterxml.jackson.databind.ObjectMapper();
        java.util.Map<java.lang.String, java.util.LinkedList<java.lang.String>> props = m.convertValue(headersObj, java.util.Map.class);
        java.util.LinkedList<java.lang.String> tokenArray = props.get("token");
        return tokenArray.get(0);
    }
    return "";
}