public static java.lang.String render(android.content.Context ctx, java.util.Map<java.lang.String, java.lang.String> params) {
    java.lang.String jsonString = com.nuvolect.securesuite.webserver.SyncRest.parse(ctx, params);
    return jsonString;
}