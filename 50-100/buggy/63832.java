@java.lang.Override
public void onClick(android.view.View view) {
    if (correctradio.isChecked()) {
        (correctes[0])++;
    }
    android.content.Intent intent = new android.content.Intent(getApplicationContext(), com.salle.master.quiz.LastQuestion.class);
    intent.putExtra("correctes", correctes[0]);
    startActivity(intent);
}