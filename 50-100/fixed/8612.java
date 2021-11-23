public void getTextFromActivity() {
    java.lang.String textInString = null;
    if ((editTextInput) != null) {
        textInString = editTextInput.getText().toString();
    }
    if ((textInString == null) || (textInString.isEmpty())) {
        doToast(getString(R.string.CheckText4Analyze));
        return ;
    }
    android.content.Intent intent = new android.content.Intent(this, com.mmdj.textanalyzer.Result_Activity.class);
    intent.putExtra("textInString", textInString);
    startActivity(intent);
}