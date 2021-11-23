public static void make_video_a() {
    AudioServer.speakers.drain();
    AudioServer.speakers.close();
    AudioServer.microphone.stop();
    AudioServer.microphone.close();
    AudioServer.line.stop();
    AudioServer.line.drain();
    AudioServer.line.close();
}