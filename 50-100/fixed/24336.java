protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws java.io.IOException, javax.servlet.ServletException {
    java.lang.String quizName = request.getParameter("quizName");
    java.util.ArrayList<Interfaces.QuestionInterface> questions = new java.util.ArrayList<Interfaces.QuestionInterface>();
    Classes.Quiz newQuiz = new Classes.Quiz(questions, 0, null, quizName, false, false, false);
    db.managers.QuizManager quizManager = ((db.managers.QuizManager) (getServletContext().getAttribute("quizManager")));
    quizManager.addQuizToDB(newQuiz);
}