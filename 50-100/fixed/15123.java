@java.lang.Override
public boolean preHandle(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response, java.lang.Object handler) throws java.lang.Exception {
    java.lang.String url = request.getRequestURI();
    java.lang.String gameIdString = url.split("/")[2];
    try {
        long gameId = java.lang.Long.parseLong(gameIdString);
        boolean canPlayGame = this.gameInterceptorService.canPlayGame(gameId);
        if (!canPlayGame) {
            return false;
        }
    } catch (java.lang.NumberFormatException exc) {
        return true;
    }
    return true;
}