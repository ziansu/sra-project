@org.springframework.web.bind.annotation.RequestMapping(value = "/addQuiz", method = org.springframework.web.bind.annotation.RequestMethod.POST)
public java.lang.String getProfessorHomePage(javax.servlet.http.HttpSession session, @org.springframework.web.bind.annotation.ModelAttribute(value = "quiz2")
gr.quizbomb.model.helper.CreateQuizSimpler quiz, @org.springframework.web.bind.annotation.RequestParam
java.lang.Long sClassId, @org.springframework.web.bind.annotation.RequestParam
java.lang.Long courseId) {
    quizService.createNewQuiz(quiz, sClassId, courseId);
    return "redirect:/professor";
}