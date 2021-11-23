private static void roadCross() {
    if (!(com.gmail.maciekhtc.offroadmaps.SpeakUtils.watchOut)) {
        com.gmail.maciekhtc.offroadmaps.SpeakUtils.tts.speak("Uważaj!", TextToSpeech.QUEUE_ADD, null);
        com.gmail.maciekhtc.offroadmaps.SpeakUtils.watchOut = true;
    }
}