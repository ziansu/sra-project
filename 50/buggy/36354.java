@org.springframework.web.bind.annotation.RequestMapping(value = "/status", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public java.lang.String isTrained() {
    java.lang.String status = "untrained";
    try {
        java.lang.String test = ann.toString();
        status = "trained";
    } catch (java.lang.NullPointerException ex) {
        status = "untrained";
    }
    return ("{\"status\":\"" + status) + "\"}";
}