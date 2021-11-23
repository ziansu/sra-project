public void sessionCreated(javax.servlet.http.HttpSessionEvent arg0) {
    javax.servlet.http.HttpSession s = arg0.getSession();
    s.setAttribute("MasterUser", null);
    s.setAttribute("QuestionList", questionList);
}