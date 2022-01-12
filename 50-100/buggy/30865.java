private digital.torpedo.yaci.webserver.Response getView(java.lang.String viewName, java.util.function.Function<java.lang.String, java.lang.String> replaceFunction) {
    try {
        return newFixedLengthResponse(replaceFunction.apply(digital.torpedo.yaci.webserver.Views.get(viewName)));
    } catch (java.io.IOException ioe) {
        java.lang.System.err.println((("Failed to load view " + viewName) + "\n"));
        return digital.torpedo.yaci.webserver.Responses.somethingWentWrong();
    }
}