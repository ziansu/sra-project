protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws java.io.IOException, javax.servlet.ServletException {
    java.lang.System.out.println(request.getParameter("quizId"));
    int quizId = java.lang.Integer.valueOf(request.getParameter("quizId"));
    quizzes.QuizManager quizManager = ((quizzes.QuizManager) (request.getServletContext().getAttribute("quizManager")));
    quizManager.deleteQuizAnswers(quizId);
    java.lang.String url = "edit-quiz.jsp?id=" + quizId;
    javax.servlet.RequestDispatcher d = request.getRequestDispatcher(url);
    d.forward(request, response);
}