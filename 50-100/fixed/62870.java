@java.lang.Override
public void run() {
    while (!(java.lang.Thread.currentThread().isInterrupted())) {
        question = clientIO.getQuestion();
        while ((question) == null) {
            if (java.lang.Thread.currentThread().isInterrupted())
                return ;
            
            question = clientIO.getQuestion();
        } 
        questScreen.setQuestion(question);
        setUpGUI();
        questScreen.goToQuestionMode();
    } 
}