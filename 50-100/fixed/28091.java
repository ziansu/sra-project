private boolean quizQuestionIsWrong(int index) {
    org.openqa.selenium.By feedbackLink = com.nedellis.selenium.MyEasyTrack.getCorrectAnswerText(index);
    if (isPresent(feedbackLink)) {
        java.lang.String feedback = getText(feedbackLink);
        feedback = feedback.substring(0, 14);
        return feedback.equals("Correct Answer");
    }else
        return false;
    
}