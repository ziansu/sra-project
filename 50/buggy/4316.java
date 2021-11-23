public static controllers.Result blockNotify(java.lang.String payload) {
    if (!(request().remoteAddress().equals("127.0.0.1")))
        return unauthorized("This endpoint can only reached through localhost");
    
    return ok("NOT IMPLEMENTED YET");
}