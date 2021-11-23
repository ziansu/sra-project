@java.lang.Override
protected java.lang.String doInBackground(java.lang.String... params) {
    try {
        translatedText = translate(params[0], params[1]);
    } catch (java.lang.Exception e) {
        translatedText = params[0];
    }
    return translatedText;
}