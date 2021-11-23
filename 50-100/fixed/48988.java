void speak() {
    final android.text.Editable text = input.getEditableText();
    input.beginBatchEdit();
    try {
        lastSentence = text.toString();
        updateRepeatButton();
        speakSentence(lastSentence);
        text.clear();
    } finally {
        input.endBatchEdit();
    }
}