@java.lang.Override
protected java.lang.String doInBackground(java.lang.String... params) {
    showTranslation(translationService.translate(params[0], Language.ENGLISH, selectedTargetLanguage).execute().getFirstTranslation());
    return "Did translate";
}