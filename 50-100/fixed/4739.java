private boolean isUnauthorized(java.util.Map<java.lang.String, java.lang.Object> response, boolean throwOnUnauthorized) throws com.pokitdok.UnauthorizedException {
    boolean unauthorized = false;
    if (response != null) {
        if (response.containsKey("message")) {
            if ("Unauthorized".equals(response.get("message"))) {
                unauthorized = true;
            }
        }
    }
    if (throwOnUnauthorized && unauthorized) {
        throw new com.pokitdok.UnauthorizedException("Unauthorized");
    }
    return unauthorized;
}