@java.lang.Override
public void onSpeakStarted(java.lang.String speakingText) {
    listener.onSpeakStarted(speakingText);
    if (isHelloSpeak) {
        isHelloSpeak = false;
    }else {
        if ((body) != null) {
            body.doSpeakingAction();
        }else
            if ((transparentBody) != null) {
                transparentBody.doSpeakingAction();
            }
        
    }
}