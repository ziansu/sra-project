public void startRecognition() throws java.lang.Exception {
    java.lang.System.out.println("start recognition");
    recognizer.startRecognition(true);
    while (this.transcriberEnabled) {
        java.lang.String utterance = recognizer.getResult().getHypothesis();
        java.lang.System.out.println(utterance);
        if (utterance.equals("robot")) {
            this.transcriberListener.onSuccessfulTrigger();
        }
    } 
}