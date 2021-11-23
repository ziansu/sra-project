@java.lang.Override
public void run() {
    while (!(java.lang.Thread.currentThread().isInterrupted())) {
        question = clientIO.getQuestion();
        while (((question) == null) && (!(java.lang.Thread.currentThread().isInterrupted())))
            question = clientIO.getQuestion();
        
        questScreen.setQuestion(question);
        setUpGUI();
        questScreen.goToQuestionMode();
    } 
}