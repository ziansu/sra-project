private void pauseAfterParagraph(boolean lastParagraph, teaselib.core.texttospeech.TextToSpeechPlayer speechSynthesizer) {
    final boolean spokenMessage = speechSynthesizer != null;
    if (lastParagraph) {
        if (spokenMessage) {
            mandatoryCompleted();
            teaseLib.sleep(teaselib.core.RenderMessage.DELAYATENDOFTEXT, java.util.concurrent.TimeUnit.MILLISECONDS);
        }
        allCompleted();
    }else {
        if (spokenMessage) {
            teaseLib.sleep(teaselib.core.RenderMessage.DELAYBETWEENPARAGRAPHS, java.util.concurrent.TimeUnit.MILLISECONDS);
        }
    }
}