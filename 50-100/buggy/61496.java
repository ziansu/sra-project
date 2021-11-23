public static void getUser(java.lang.Long eventId, intouchteam.intouch.intouchapi.InTouchCallback callback) {
    java.util.Map<java.lang.String, java.util.List<java.lang.String>> requestParameters = new java.util.HashMap<>();
    requestParameters.put("method", java.util.Collections.singletonList("getUserById"));
    requestParameters.put("user_id", java.util.Collections.singletonList(intouchteam.intouch.intouchapi.InTouchApi.getProfile().getId().toString()));
    intouchteam.intouch.intouchapi.InTouchRequest.get(requestParameters, callback);
}