@java.lang.Override
public android.view.View getView(int position, android.view.View convertView, android.view.ViewGroup parent) {
    if (convertView == null) {
        convertView = android.view.LayoutInflater.from(getContext()).inflate(R.layout.activity_home_question, parent, false);
    }
    com.example.kaiwang.answerbot.Questions plQuestion = getItem(position);
    android.widget.TextView MainQuestion = ((android.widget.TextView) (convertView.findViewById(R.id.qquestion)));
    java.lang.String question = plQuestion.question_body;
    MainQuestion.setText(question);
    return convertView;
}