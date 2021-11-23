public static final uk.ac.cam.quebec.userapi.RequestType getRequestType(java.lang.String message) {
    java.util.regex.Matcher m = uk.ac.cam.quebec.userapi.RequestType.parsePattern.matcher(message);
    if (!(m.matches())) {
        return uk.ac.cam.quebec.userapi.RequestType.InvalidRequest;
    }else {
        java.lang.String s = m.group(1);
        if (uk.ac.cam.quebec.userapi.RequestType.lookupMap.containsKey(s)) {
            return uk.ac.cam.quebec.userapi.RequestType.lookupMap.get(s);
        }
    }
    return uk.ac.cam.quebec.userapi.RequestType.DefaultRequest;
}