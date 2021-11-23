public static void message(java.lang.String text) {
    {
        org.liblouis.BrailleTranslation brl = org.nbp.b2g.ui.TranslationUtilities.newBrailleTranslation(text, false);
        Devices.braille.get().write((brl != null ? brl.getBrailleAsString() : text), ApplicationParameters.BRAILLE_MESSAGE_DURATION);
    }
    org.nbp.b2g.ui.SpeechDevice speech = Devices.speech.get();
    synchronized(speech) {
        speech.stopSpeaking();
        speech.say(text);
    }
}