@java.lang.Override
protected java.lang.String doInBackground(java.lang.String... params) {
    if (((textForRecognition) != null) && (!(textForRecognition.equals(""))));
    serverResponseJSON = new com.example.lj.asrttstest.text.CloudTextRecognizer().startTextRecognition(textForRecognition);
    return null;
}