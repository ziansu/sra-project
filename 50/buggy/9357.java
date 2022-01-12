@org.springframework.web.bind.annotation.RequestMapping(value = "/data/tests/setQuestionType")
@org.springframework.web.bind.annotation.ResponseBody
public java.lang.Boolean setCurrentQuestionType(@org.springframework.web.bind.annotation.RequestParam(value = "questionType")
java.lang.String questionType, @org.springframework.web.bind.annotation.RequestParam(value = "questionID")
java.lang.Long questionID) {
    adminUtils.updateQuestion(questionType, questionID);
    return true;
}