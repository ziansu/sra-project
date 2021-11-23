@java.lang.Override
protected void onPostExecute(java.lang.String result) {
    if (result == "Failed") {
        android.widget.Toast.makeText(getApplicationContext(), "No Connection to Database", Toast.LENGTH_LONG).show();
        startActivity(new android.content.Intent(this, com.example.dennis.nerdquiz.MainActivity.class));
        finish();
    }else {
        super.onPostExecute(result);
        progressDialog.dismiss();
        QuestionAndButtons = extractJSON(result);
        firstQuestion = Question(QuestionAndButtons);
        QuestionAndButtonsParts = firstQuestion.split(";");
        NameButtons();
    }
}