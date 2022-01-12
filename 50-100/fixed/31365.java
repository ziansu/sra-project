public com.darkprograms.speech.raiseYourHand.GooglesAnswer endAudioCapture() {
    java.lang.System.out.println("DEBUG: stop recording flag set");
    stopRecording = true;
    java.lang.System.out.println("DEBUG: waiting for google reply");
    while ((messageRecieved) == false) {
        try {
            java.lang.Thread.sleep(100);
        } catch (java.lang.InterruptedException e) {
            e.printStackTrace();
        }
    } 
    java.lang.System.out.println("DEBUG: got google reply, transaction complete.");
    messageRecieved = false;
    return googleSaid;
}