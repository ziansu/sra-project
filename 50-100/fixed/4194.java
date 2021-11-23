public static void message(java.lang.String text) {
    Devices.braille.get().write(text, ApplicationParameters.BRAILLE_MESSAGE_DURATION);
    org.nbp.b2g.ui.SpeechDevice speech = Devices.speech.get();
    synchronized(speech) {
        speech.stopSpeaking();
        speech.say(text);
    }
}