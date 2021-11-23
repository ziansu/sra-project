private void skillQualificationExam(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response, edu.uci.ics.sdcl.firefly.Worker worker) throws java.io.IOException, javax.servlet.ServletException {
    request.setAttribute("workerId", worker.getWorkerId().toString());
    request.setAttribute("subAction", "gradeAnswers");
    response.addCookie(new javax.servlet.http.Cookie("w", worker.getWorkerId()));
    request = this.loadQuestions(request, response);
    request.getRequestDispatcher(SkillTestPage).forward(request, response);
}