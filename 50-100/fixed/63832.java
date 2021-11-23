@java.lang.Override
public void onClick(android.view.View view) {
    java.lang.Integer correctes = 0;
    if (correctradio.isChecked()) {
        correctes++;
    }
    android.content.Intent intent = new android.content.Intent(getApplicationContext(), com.salle.master.quiz.LastQuestion.class);
    intent.putExtra("correctes", correctes);
    startActivity(intent);
}