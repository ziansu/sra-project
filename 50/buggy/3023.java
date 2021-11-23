public void speak(java.lang.String text) {
    new java.lang.Thread(() -> speakBlocking(text)).start();
}