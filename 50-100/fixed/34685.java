public static boolean answerRequestTest() {
    server.gamebuilder.model.Request request = new server.gamebuilder.model.Request(1, server.gamebuilder.model.RequestState.UNANSWERED);
    boolean response;
    try {
        response = server.gamebuilder.controller.RequestHandler.answerRequest(request, RequestState.ACCEPTED);
    } catch (java.lang.ClassNotFoundException | java.sql.SQLException ex) {
        response = false;
        java.util.logging.Logger.getLogger(server.Test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    return response;
}