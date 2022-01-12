private void translate() {
    if (com.volkov.alexandr.mytranslate.ui.TranslateFragment.hasConnection(getContext())) {
        java.lang.String text = etTrText.getText().toString();
        if (text.isEmpty()) {
            com.volkov.alexandr.mytranslate.ui.Toast.makeText(getContext(), "Введена пустая строка", Toast.LENGTH_SHORT).show();
        }else {
            api.translate(new com.volkov.alexandr.mytranslate.model.Word(text, from), to, this);
        }
    }else {
        failedTranslate();
        android.util.Log.e(com.volkov.alexandr.mytranslate.ui.TranslateFragment.LOG_TAG, "No internet connection for translate");
    }
}