public void speech(android.view.View view) {
    android.widget.Toast.makeText(this, "speech", Toast.LENGTH_SHORT).show();
    int speak = mSpeechSynthesizer.speak("哈哈哈");
    java.lang.System.out.println(("88888888=====speak=" + speak));
}